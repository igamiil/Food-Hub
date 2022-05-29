package com.example.foodhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_screen extends BaseActivity {
    Button welc_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        welc_Btn = findViewById(R.id.welc_btn);

        welc_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_screen(OnBoarding.class);
            }
        });
    }
}