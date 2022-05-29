package com.example.foodhub.mvp.models;

public class Popular {

    public int popular_img;
    public String popular_title;
    public String popular_price;

    public int getPopular_img() {
        return popular_img;
    }

    public void setPopular_img(int popular_img) {
        this.popular_img = popular_img;
    }

    public String getPopular_title() {
        return popular_title;
    }

    public void setPopular_title(String popular_title) {
        this.popular_title = popular_title;
    }

    public String getPopular_price() {
        return popular_price;
    }

    public void setPopular_price(String popular_price) {
        this.popular_price = popular_price;
    }

    public String getPopular_rating() {
        return popular_rating;
    }

    public void setPopular_rating(String popular_rating) {
        this.popular_rating = popular_rating;
    }

    public String getPopular_dis() {
        return popular_dis;
    }

    public void setPopular_dis(String popular_dis) {
        this.popular_dis = popular_dis;
    }

    public String popular_rating;
    public String popular_dis;

    public Popular(int popular_img, String popular_title, String popular_price, String popular_rating, String popular_dis) {
        this.popular_img = popular_img;
        this.popular_title = popular_title;
        this.popular_price = popular_price;
        this.popular_rating = popular_rating;
        this.popular_dis = popular_dis;
    }
}
