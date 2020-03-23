package com.pareandroid.infocovid_19.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiconfig {
    private static final String BASE_URL = "https://api.kawalcorona.com/";
    private  static Retrofit retrofit;
//    public static Retrofit getretrofit(){
//        return new Retrofit.Builder()
//                .baseUrl(ApiUrl.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }

            public static Retrofit getRetrofit(){
                if (retrofit==null){
                    retrofit=new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
                return retrofit;
            }
}
