package com.example.homeworktask2;

public class FoodItem {

    // unique identifier of an article
    private int foodId;

    private String name;

    private String cost;

    private String description;


    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;

    public FoodItem(int foodId, String name, String cost, String description, int imageDrawableId) {
        this.foodId = foodId;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) { this.imageDrawableId = imageDrawableId; }
}
