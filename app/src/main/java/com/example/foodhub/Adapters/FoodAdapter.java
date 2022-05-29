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
import com.example.foodhub.mvp.models.Food;
import com.example.foodhub.mvp.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.viewHolder> {

    Context context;

    List<Food> data = new ArrayList<>();

    public void setData(List<Food> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public FoodAdapter(Context context) {
        this.context = context;
    }

    //layout -> View
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item, parent, false);
        return new viewHolder(v);
    }

    //Data
    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        Food i = data.get(position);
        holder.popular_title.setText(i.name);
        holder.popular_rating.setText(i.rating);
        holder.popular_price.setText(i.price);
        holder.popular_dis.setText(i.description);
        Glide.with(context).load(Constants.ImageFolderUrl + i.getPic()).into(holder.popular_img);
    }

    //findViewById
    class viewHolder extends RecyclerView.ViewHolder {
        ImageView popular_img;
        TextView popular_title;
        TextView popular_rating;
        TextView popular_price;
        TextView popular_dis;

        public viewHolder(View v) {
            super(v);
            popular_img = v.findViewById(R.id.popular_img);
            popular_title = v.findViewById(R.id.popular_title);
            popular_rating = v.findViewById(R.id.popular_rating);
            popular_dis = v.findViewById(R.id.poplar_dis);
            popular_price = v.findViewById(R.id.popular_price);
        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
