package com.example.foodhub;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_up extends BaseActivity {
    TextView login_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        login_txt = findViewById(R.id.login_txt);
        login_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_screen(Sign_in.class);
            }
        });

    }
}