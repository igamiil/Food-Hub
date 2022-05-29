package com.example.foodhub.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodhub.Constants;
import com.example.foodhub.R;
import com.example.foodhub.mvp.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.viewHolder> {

    Context context;

    List<Restaurant> data = new ArrayList<>();

    public void setData(List<Restaurant> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public RestaurantAdapter(Context context) {
        this.context = context;
    }

    //layout -> View
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_item, parent, false);
        return new viewHolder(v);
    }

    //Data
    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        Restaurant i = data.get(position);
        holder.rest_name.setText(i.name);
        holder.rating_num.setText(i.number_of_ratings);
        holder.rest_rating.setText(i.rating);
        holder.delivery_cost.setText(i.delivery);
        holder.delivery_time.setText(i.delivery_time);
        Glide.with(context).load(Constants.ImageFolderUrl + i.getCover_photo()).into(holder.rest_img);
    }

    //findViewById
    class viewHolder extends RecyclerView.ViewHolder {
        ImageView rest_img;
        TextView rest_name;
        TextView rest_cat;
        TextView rest_rating;
        TextView delivery_cost;
        TextView delivery_time;
        TextView rating_num;

        public viewHolder(View v) {
            super(v);
            rest_img = v.findViewById(R.id.rest_img);
            rest_name = v.findViewById(R.id.rest_name);
            rest_cat = v.findViewById(R.id.rest_cat);
            rating_num = v.findViewById(R.id.rating_num);
            rest_rating = v.findViewById(R.id.rest_rating);
            delivery_time = v.findViewById(R.id.delivery_time);
            delivery_cost = v.findViewById(R.id.delivery_cost);
        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
