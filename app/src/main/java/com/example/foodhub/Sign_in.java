package com.example.foodhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_in extends BaseActivity {
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_screen(Home_screen.class);
            }
        });

    }
}