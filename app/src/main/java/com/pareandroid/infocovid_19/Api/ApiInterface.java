package com.pareandroid.infocovid_19.Api;

import com.pareandroid.infocovid_19.Model.ModelDaerahIdn;
import com.pareandroid.infocovid_19.Model.RingkasanModel;
import com.pareandroid.infocovid_19.Model.RiwayatModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("indonesia")
    Call<ModelDaerahIdn> getdataDaerah();

//    @GET(ApiUrl.END_POINT_HISTORY_WORLD)
//    Call<List<RiwayatModel>>getRiwayatModel();
//
//    @GET(ApiUrl.END_POINT_SUMMARY_WORLD)
//    Call<List<RingkasanModel>>getsummaryworld();
}
