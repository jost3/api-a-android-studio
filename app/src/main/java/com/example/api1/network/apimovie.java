package com.example.api1.network;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.api1.model.movie;

import java.util.List;

public interface apimovie {

    @GET("api/producto")
    Call<List<movie>> getmovie();
}
