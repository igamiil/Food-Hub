package com.example.foodhub.mvp.models;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private ArrayList<Category> categories;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Food> foods;

    public List<Category> getCategories() {
        return categories;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
