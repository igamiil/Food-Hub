package com.example.foodhub;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodhub.Adapters.CategoryAdapter;
import com.example.foodhub.Adapters.FoodAdapter;
import com.example.foodhub.Adapters.RestaurantAdapter;
import com.example.foodhub.mvp.models.Popular;
import com.example.foodhub.mvp.models.Root;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home_screen extends BaseActivity {

    ImageView menu_btn;
    SlidingRootNav slidingRootNav;
    ImageView cart_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        CategoryAdapter adapter = new CategoryAdapter(this);

        RecyclerView cat_lst = findViewById(R.id.cat_lst);
        cat_lst.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        RecyclerView rest_lst = findViewById(R.id.rest_lst);


        RestaurantAdapter rest_adapter = new RestaurantAdapter(this);
        rest_lst.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        RecyclerView popular_lst = findViewById(R.id.popular_lst);


        FoodAdapter popular_adapter = new FoodAdapter(this);
        popular_lst.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        popular_lst.setAdapter(popular_adapter);







        FoodClient.getINSTANCE().getRoot().enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {

                adapter.setData(response.body().getCategories());
                Log.e("aaa","gamil" +response.body().getCategories().get(0).getCat_name());
                rest_adapter.setData(response.body().getRestaurants());
                popular_adapter.setData(response.body().getFoods());



            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                Log.e("aaa","gamil" +t.getMessage());

            }
        });

        cat_lst.setAdapter(adapter);
        rest_lst.setAdapter(rest_adapter);





        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        slidingRootNav = new SlidingRootNavBuilder(this)
                .withMenuOpened(false)
                .withMenuLayout(R.layout.fragment_side_menu)
                .inject();


        menu_btn = findViewById(R.id.menu_btn);
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slidingRootNav.openMenu();


            }
        });


        cart_btn = findViewById(R.id.cart_btn);




















    }

    public void navBar(View v){
        switch (v.getId()){
            case R.id.cart_btn:
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.frame, Profile.class, null)
                        .commit();
                break;

        }
    }



}