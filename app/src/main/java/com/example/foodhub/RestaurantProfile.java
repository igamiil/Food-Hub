package com.example.foodhub;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantProfile extends BaseActivity {

    RecyclerView featured_lst;
    RecyclerView options_lst;
    RecyclerView sel_op_lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_restaurant_profile);

        featured_lst = findViewById(R.id.featured_lst);
        options_lst = findViewById(R.id.options_lst);
        sel_op_lst = findViewById(R.id.sel_op_lst);


        featured_lst.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        options_lst.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        sel_op_lst.setLayoutManager(new GridLayoutManager(this,2));






    }
}
