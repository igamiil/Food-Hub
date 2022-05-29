package com.example.foodhub;

import android.os.Bundle;
import android.os.Handler;

public class Splash extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                go_screen(Welcome_screen.class);

            }
        }, 3000);


    }
}