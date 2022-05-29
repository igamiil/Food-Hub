package com.example.foodhub;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.foodhub.Adapters.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class OnBoarding extends BaseActivity {
    SliderView sliderView;
    SliderAdapter sliderAdapter;
    ImageButton board_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);


        sliderView = findViewById(R.id.imageSlider);
        sliderAdapter = new SliderAdapter();
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);

        board_btn = findViewById(R.id.board_btn);

        board_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_screen(Sign_up.class);
            }
        });


    }
}