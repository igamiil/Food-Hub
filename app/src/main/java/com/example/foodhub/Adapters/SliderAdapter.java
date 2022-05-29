package com.example.foodhub.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodhub.R;
import com.example.foodhub.data.SliderData;
import com.example.foodhub.mvp.models.Boarding;
import com.smarteist.autoimageslider.SliderViewAdapter;


public class SliderAdapter extends SliderViewAdapter<SliderAdapter.MyHolder> {


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.board_item, null);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder viewHolder, int position) {
        Boarding i = SliderData.slides[position];
        viewHolder.board_txt.setText(i.boarding_title);
        viewHolder.board_img.setImageResource(i.boarding_img);
    }


    @Override
    public int getCount() {
        return SliderData.slides.length;


    }

    class MyHolder extends SliderAdapter.ViewHolder {
        ImageView board_img;
        TextView board_txt;

        public MyHolder(View view) {

            super(view);

            board_img = view.findViewById(R.id.board_img);
            board_txt = view.findViewById(R.id.board_txt);


        }
    }
}
