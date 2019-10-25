package com.example.homeworktask2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_fooditem);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FoodItemAdapter fdAdapter = new FoodItemAdapter();
        fdAdapter.setData((FakeDatabase.getAllFoodItem()));
        recyclerView.setAdapter(fdAdapter);

        Button viewOrderBtn = findViewById(R.id.order);
        viewOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

    }


}
