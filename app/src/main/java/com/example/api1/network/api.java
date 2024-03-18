package com.example.api1.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class api {

    private static Retrofit retrofit;
    public static Retrofit getapi(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://prub.colegiohessen.edu.pe/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return  retrofit;
    }


}
