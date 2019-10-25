package com.example.homeworktask2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

//import static com.example.homeworktask2.Order.orders;


//on opening screen all the food items displayed
public class FoodItemDetailActivity extends AppCompatActivity {


    public static int i=0;
    private TextView nameTextView;
    private TextView costTextView;
    private TextView desTextView;
    private ImageView imageView;
    private ElegantNumberButton orderAmountENB;
    private Button orderBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooditem_detail);

        Intent intent = getIntent();

        // Get the extra identified by "FoodID" that was put into the intent at the origin.
        int foodId = intent.getIntExtra("foodId", 0);

        final FoodItem fooditem = FakeDatabase.getFoodItemById(foodId);

        nameTextView = findViewById(R.id.detailName);
        costTextView = findViewById(R.id.detailCost);
        desTextView = findViewById(R.id.detailDes);
        imageView = findViewById(R.id.detailImage);
        orderAmountENB = findViewById(R.id.orderAmount);
        Button orderBtn = findViewById(R.id.orderBtn);


        nameTextView.setText(fooditem.getName());
        costTextView.setText(fooditem.getCost());
        desTextView.setText(fooditem.getDescription());
        imageView.setImageResource(fooditem.getImageDrawableId());


        orderBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                final String nameString = fooditem.getName();
                final double costDouble = Double.parseDouble(costTextView.getText().toString());
                final int amountInt = Integer.parseInt(orderAmountENB.getNumber());

                OrderActivity.orderArrayList.add(new Order(i++, nameString, costDouble, amountInt));
                //i++;
                OrderActivity.setOrderArrayList(OrderActivity.orderArrayList);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


}