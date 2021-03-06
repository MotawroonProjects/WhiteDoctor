package com.motman_doctor.ui.activity_notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.motman_doctor.R;
import com.motman_doctor.adapters.NotificationAdapter;
import com.motman_doctor.databinding.ActivityMedicalAdviceBinding;
import com.motman_doctor.databinding.ActivityNotificationBinding;
import com.motman_doctor.language.Language;
import com.motman_doctor.models.NotificationModel;
import com.motman_doctor.mvp.activity_notification_mvp.ActivityNotificationPresenter;
import com.motman_doctor.mvp.activity_notification_mvp.ActivityNotificationView;
import com.motman_doctor.share.Common;

import java.util.ArrayList;
import java.util.List;

import io.paperdb.Paper;

public class NotificationActivity extends AppCompatActivity implements ActivityNotificationView {

    private ActivityNotificationBinding binding;
    private String lang;
    private List<NotificationModel.Data> notificationModelList;
    private NotificationAdapter adapter;
    private ActivityNotificationPresenter presenter;
    private ProgressDialog dialog;
    private int pos = -1;

    @Override
    protected void attachBaseContext(Context newBase) {
        Paper.init(newBase);
        super.attachBaseContext(Language.updateResources(newBase, Paper.book().read("lang", "ar")));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_notification);
        initView();

    }

    private void initView() {
        notificationModelList = new ArrayList<>();
        Paper.init(this);
        lang = Paper.book().read("lang", "ar");
        binding.setLang(lang);
        binding.recView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NotificationAdapter(notificationModelList, this);
        binding.recView.setAdapter(adapter);
        presenter = new ActivityNotificationPresenter(this, this);
        presenter.getNotifications();
        binding.llBack.setOnClickListener(view -> finish());
    }

    @Override
    public void onSuccess(List<NotificationModel.Data> data) {
        if (data.size() > 0) {
            binding.tvNoData.setVisibility(View.GONE);
            notificationModelList.addAll(data);
            adapter.notifyDataSetChanged();
        } else {
            binding.tvNoData.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public void onFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressBar() {
        binding.tvNoData.setVisibility(View.GONE);
        binding.progBar.setVisibility(View.VISIBLE);
        notificationModelList.clear();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void hideProgressBar() {
        binding.progBar.setVisibility(View.GONE);

    }

    @Override
    public void onLoad() {
        if (dialog == null) {
            dialog = Common.createProgressDialog(this, getString(R.string.wait));
            dialog.setCancelable(false);
        } else {
            dialog.dismiss();
        }
        dialog.show();
    }

    @Override
    public void onFinishload() {
        dialog.dismiss();
    }

    @Override
    public void onSuccessDelete() {
        notificationModelList.remove(pos);
        adapter.notifyItemRemoved(pos);
    }

    public void delete(int position) {
        pos = position;
        presenter.deltenotification(notificationModelList.get(position).getId());
    }
}