package com.example.foodhub.mvp.models;

public class Food {
    public String id;
    public String restaurant_id;
    public String cat_id;
    public String name;
    public String pic;
    public String price;
    public String description;
    public String rating;
    public String number_of_ratings;

    public String getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNumber_of_ratings() {
        return number_of_ratings;
    }

    public void setNumber_of_ratings(String number_of_ratings) {
        this.number_of_ratings = number_of_ratings;
    }
}
