package com.example.foodhub;

import com.example.foodhub.mvp.models.Root;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FoodInterface {
    @FormUrlEncoded
    @POST("food/serv.php")
    public Call<Root> getRoot(@Field("method") String method);
}
