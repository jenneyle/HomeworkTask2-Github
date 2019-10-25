package com.example.homeworktask2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    public static ArrayList<Order> orderToAdapt;

    public void setData(ArrayList<Order> orderToAdapt) {
        this.orderToAdapt = orderToAdapt;
    }
    @NonNull
    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item, parent, false);

        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

        final Order orderItemAtPosition = orderToAdapt.get(position);

        holder.foodNameText.setText(orderItemAtPosition.getFoodName());

        String costDouble = Double.toString(orderItemAtPosition.getCost());
        holder.costText.setText("Cost: $" + costDouble + "0");

        String qtyInt = Integer.toString(orderItemAtPosition.getQty());

        holder.qtyText.setText("Quantity: " + qtyInt);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, Order.class);
                intent.putExtra("orderId", orderItemAtPosition.getOrderId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return orderToAdapt.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView foodNameText;
        public TextView qtyText;
        public TextView costText;


        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            foodNameText = itemView.findViewById(R.id.food_Name_Order);
            qtyText = itemView.findViewById(R.id.qty_Order);
            costText = itemView.findViewById(R.id.cost_Order);
        }
    }
}
