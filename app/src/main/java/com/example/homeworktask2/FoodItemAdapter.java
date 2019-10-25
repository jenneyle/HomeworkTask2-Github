package com.example.homeworktask2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder> {
    private ArrayList<FoodItem> foodItemsToAdapt;

    public void setData(ArrayList<FoodItem> foodItemsToAdapt) {
        this.foodItemsToAdapt = foodItemsToAdapt;
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);

        FoodItemViewHolder foodItemViewHolder = new FoodItemViewHolder(view);
        return foodItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {
        final FoodItem foodItemAtPosition = foodItemsToAdapt.get(position);
        holder.nameTextView.setText(foodItemAtPosition.getName());
        holder.costTextView.setText("$ " + foodItemAtPosition.getCost());
        holder.itemImageView.setImageResource(foodItemAtPosition.getImageDrawableId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();
                Intent intent = new Intent(context, FoodItemDetailActivity.class);
                intent.putExtra("foodId", foodItemAtPosition.getFoodId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodItemsToAdapt.size();
    }

    public static class FoodItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView costTextView;
        public ImageView itemImageView;

        public FoodItemViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            nameTextView = itemView.findViewById(R.id.food_name);
            costTextView = itemView.findViewById(R.id.food_cost);
            itemImageView = itemView.findViewById(R.id.food_pic);
        }
    }
}
