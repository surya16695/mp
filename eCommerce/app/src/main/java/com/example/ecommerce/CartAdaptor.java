package com.example.ecommerce;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class CartAdaptor extends RecyclerView.Adapter<CartAdaptor.ViewHolder> {

    private Context context;

    public CartAdaptor(Context context, HashMap<String, CartItem> cart) {
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_cart_item, viewGroup, false);
        final CartAdaptor.ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdaptor.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView cartNameDsiplay, cartPriceDisplay;
        public Button cartItemDelete;

        public ViewHolder(View cartView) {
            super(cartView);
            cartNameDsiplay = cartView.findViewById(R.id.cart_item_name);
            cartPriceDisplay = cartView.findViewById(R.id.cart_item_price);
            cartItemDelete = cartView.findViewById(R.id.cart_item_delete_btn);
        }
    }
}
