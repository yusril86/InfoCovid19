package com.pareandroid.infocovid_19.view;

import android.widget.Toast;

import com.pareandroid.infocovid_19.Api.ApiInterface;
import com.pareandroid.infocovid_19.Api.Apiconfig;
import com.pareandroid.infocovid_19.MainActivity;
import com.pareandroid.infocovid_19.Model.ModelDaerahIdn;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ViewDaerah extends ViewModel {
    private MutableLiveData<ModelDaerahIdn> modelDaerahIdnMutableLiveData = new MutableLiveData<>();

    public void setDataDaerah(){
        Retrofit retrofit = Apiconfig.getRetrofit();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<ModelDaerahIdn> daerahIdnCall = apiInterface.getdataDaerah();

        daerahIdnCall.enqueue(new Callback<ModelDaerahIdn>() {
            @Override
            public void onResponse(Call<ModelDaerahIdn> call, Response<ModelDaerahIdn> response) {
                modelDaerahIdnMutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<ModelDaerahIdn> call, Throwable t) {
                t.getLocalizedMessage();
            }
        });
    }

    public LiveData<ModelDaerahIdn> getDataDaerah(){
        return modelDaerahIdnMutableLiveData;
    }
}
