package com.example.homeworktask2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {




    public static ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public static void setOrderArrayList(ArrayList<Order> orderArrayList) {
        OrderActivity.orderArrayList = orderArrayList;
    }

    public static ArrayList<Order> orderArrayList = new ArrayList<Order>();

    private RecyclerView recyclerView1;
    private OrderAdapter oAdapter;
    public static TextView total;


    double tCost = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        recyclerView1 = findViewById(R.id.rv_orderItem);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        OrderAdapter oAdapter = new OrderAdapter();
        oAdapter.setData(orderArrayList);
        recyclerView1.setAdapter(oAdapter);
        total = findViewById(R.id.total_Order);

        int size = orderArrayList.size();
        for(int i = 0; i < size ; i++){
            tCost += (orderArrayList.get(i).getCost() * orderArrayList.get(i).getQty());
        }

        total.setText("$"+String.valueOf(tCost + "0"));

    }
}

