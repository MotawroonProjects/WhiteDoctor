package com.motman_doctor.adapters;

import android.content.Context;
import android.net.Uri;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.motman_doctor.R;
import com.motman_doctor.databinding.AddImagesMoreRowBinding;
import com.motman_doctor.databinding.AddImagesRowBinding;
import com.motman_doctor.databinding.ImagesRowBinding;
import com.motman_doctor.models.ApointmentModel;
import com.motman_doctor.tags.Tags;
import com.motman_doctor.ui.activity_sign_up.fragments.FragmentSignUp2;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AppoinmentImagesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ApointmentModel.Data.Images> list;
    private Context context;
    private LayoutInflater inflater;

    public AppoinmentImagesAdapter(List<ApointmentModel.Data.Images> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


            ImagesRowBinding binding = DataBindingUtil.inflate(inflater, R.layout.images_row, parent, false);
            return new MyHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof MyHolder) {
            MyHolder myHolder = (MyHolder) holder;
            String uri = list.get(position).getImage();
            Picasso.get().load(Uri.parse(Tags.IMAGE_URL+uri)).fit().into(myHolder.binding.image);
          // myHolder.binding.cardViewDelete.setVisibility(View.GONE);


        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        private ImagesRowBinding binding;

        public MyHolder(ImagesRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;


        }

    }


}
