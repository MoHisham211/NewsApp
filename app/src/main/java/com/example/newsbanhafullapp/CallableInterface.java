package com.example.newsbanhafullapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface CallableInterface {

    @GET("/v2/top-headlines?apiKey=99410b4dcd75422c8cf062e7e4b1cc8b")
    Call<NewsModel> getData(@Query("category") String category,@Query("country") String country);

}
