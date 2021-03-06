package com.motman_doctor.models;

import java.io.Serializable;
import java.util.List;

public class ApointmentModel implements Serializable {

    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public class Data implements Serializable {
        public int id;
        public int user_id;
        private String time_type;
        public String patient_name;
        public String patient_phone;
        public int doctor_id;
        public String date;
        public String time;
        public double cost;
        public String reservation_type;
        private String reservation_status;
        public String status;
        public Object cancel_reason;
        public String day_name;
        public PatientFk patient_fk;
        private String details;
        private List<Images> reservations_images;

        public int getId() {
            return id;
        }

        public int getUser_id() {
            return user_id;
        }

        public String getTime_type() {
            return time_type;
        }

        public String getPatient_name() {
            return patient_name;
        }

        public String getPatient_phone() {
            return patient_phone;
        }

        public int getDoctor_id() {
            return doctor_id;
        }

        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public double getCost() {
            return cost;
        }

        public String getReservation_type() {
            return reservation_type;
        }

        public String getReservation_status() {
            return reservation_status;
        }

        public String getStatus() {
            return status;
        }

        public Object getCancel_reason() {
            return cancel_reason;
        }

        public String getDay_name() {
            return day_name;
        }

        public PatientFk getPatient_fk() {
            return patient_fk;
        }

        public String getDetails() {
            return details;
        }

        public List<Images> getReservations_images() {
            return reservations_images;
        }

        public class PatientFk implements Serializable {
            public int id;
            public String code;
            public String user_type;
            public String name;
            public Object email;
            public String phone_code;
            public String phone;
            public String gender;
            public Object address;
            public double latitude;
            public double longitude;
            public Object specialization_id;
            public Object job_degree_id;
            public Object city_id;
            public Object license_img;
            public Object logo;
            public Object banner;
            public String birth_day;
            public String blood_type;
            public String details;
            public double rates;
            public int app_cost;
            public double detection_price;
            public Object appointment_time;
            public String is_emergency;
            public Object email_verified_at;
            public String is_blocked;
            public String is_login;
            public Object logout_time;
            public int is_confirmed;
            public Object confirmation_code;
            public Object forget_password_code;
            public String software_type;
            public Object deleted_at;

            public int distance;
            private LastReservationFk last_reservation_fk;


            public int getId() {
                return id;
            }

            public String getCode() {
                return code;
            }

            public String getUser_type() {
                return user_type;
            }

            public String getName() {
                return name;
            }

            public Object getEmail() {
                return email;
            }

            public String getPhone_code() {
                return phone_code;
            }

            public String getPhone() {
                return phone;
            }

            public String getGender() {
                return gender;
            }

            public Object getAddress() {
                return address;
            }

            public double getLatitude() {
                return latitude;
            }

            public double getLongitude() {
                return longitude;
            }

            public Object getSpecialization_id() {
                return specialization_id;
            }

            public Object getJob_degree_id() {
                return job_degree_id;
            }

            public Object getCity_id() {
                return city_id;
            }

            public Object getLicense_img() {
                return license_img;
            }

            public Object getLogo() {
                return logo;
            }

            public Object getBanner() {
                return banner;
            }

            public String getBirth_day() {
                return birth_day;
            }

            public String getBlood_type() {
                return blood_type;
            }

            public String getDetails() {
                return details;
            }

            public double getRates() {
                return rates;
            }

            public int getApp_cost() {
                return app_cost;
            }

            public double getDetection_price() {
                return detection_price;
            }

            public Object getAppointment_time() {
                return appointment_time;
            }

            public String getIs_emergency() {
                return is_emergency;
            }

            public Object getEmail_verified_at() {
                return email_verified_at;
            }

            public String getIs_blocked() {
                return is_blocked;
            }

            public String getIs_login() {
                return is_login;
            }

            public Object getLogout_time() {
                return logout_time;
            }

            public int getIs_confirmed() {
                return is_confirmed;
            }

            public Object getConfirmation_code() {
                return confirmation_code;
            }

            public Object getForget_password_code() {
                return forget_password_code;
            }

            public String getSoftware_type() {
                return software_type;
            }

            public Object getDeleted_at() {
                return deleted_at;
            }

            public int getDistance() {
                return distance;
            }

            public LastReservationFk getLast_reservation_fk() {
                return last_reservation_fk;
            }

            public class LastReservationFk implements Serializable {
                private int id;
                private int user_id;
                private String patient_name;
                private String patient_phone;
                private int doctor_id;
                private String date;
                private String time;
                private String time_type;
                private double cost;
                private String reservation_type;
                private String status;
                private String cancel_reason;
                private String day_name;
                private String created_at;
                private String updated_at;

                public int getId() {
                    return id;
                }

                public int getUser_id() {
                    return user_id;
                }

                public String getPatient_name() {
                    return patient_name;
                }

                public String getPatient_phone() {
                    return patient_phone;
                }

                public int getDoctor_id() {
                    return doctor_id;
                }

                public String getDate() {
                    return date;
                }

                public String getTime() {
                    return time;
                }

                public String getTime_type() {
                    return time_type;
                }

                public double getCost() {
                    return cost;
                }

                public String getReservation_type() {
                    return reservation_type;
                }

                public String getStatus() {
                    return status;
                }

                public String getCancel_reason() {
                    return cancel_reason;
                }

                public String getDay_name() {
                    return day_name;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }
            }
        }

        public class Images implements Serializable {
            private String image;

            public String getImage() {
                return image;
            }
        }

    }


}