package com.example.homeworktask2;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private String foodName;
    private double cost;
    private int qty;



    public Order(int orderId, String foodName, double cost, int qty) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.cost = cost;
        this.qty = qty;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getCost() { return cost; }

    public void setCost(double cost) { this.cost = cost; }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
