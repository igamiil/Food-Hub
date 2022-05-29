package com.example.foodhub;

import com.example.foodhub.mvp.models.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FoodClient {

    private FoodInterface Interface;
    private static FoodClient INSTANCE;

    public FoodClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Interface = retrofit.create(FoodInterface.class);
    }

    public static FoodClient getINSTANCE () {
        if (null == INSTANCE){
            INSTANCE = new FoodClient();
        }
        return INSTANCE;
    }

    public Call<Root> getRoot(){
        return Interface.getRoot(Constants.HomeFeatures);
    }
}
