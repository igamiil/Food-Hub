package com.example.foodhub;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {

    void go_screen(Class screen){
        Intent i = new Intent(this,screen);
        startActivity(i);
    }





    void stxt(int id,String txt){
        TextView lbl = findViewById(id);
        lbl.setText(txt);
    }


    void remove_view(int ... ids){
        for (int id : ids)
            findViewById(id).setVisibility(View.GONE);
    }

   
}
