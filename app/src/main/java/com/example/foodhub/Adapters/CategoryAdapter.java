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
import com.example.foodhub.mvp.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {

    Context context;

    List<Category> data = new ArrayList<>();

    public void setData(List<Category> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public CategoryAdapter(Context context) {
        this.context = context;
    }

    //layout -> View
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_item, parent, false);
        return new viewHolder(v);
    }

    //Data
    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        Category i = data.get(position);
        holder.txt.setText(i.getCat_name());
        Glide.with(context).load(Constants.ImageFolderUrl + i.getCat_pic()).into(holder.img);
    }

    //findViewById
    class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public viewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.cat_img);
            txt = v.findViewById(R.id.cat_title);
        }
    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
