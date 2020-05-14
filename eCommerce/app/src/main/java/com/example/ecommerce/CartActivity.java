package com.example.ecommerce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    protected RecyclerView cartList;

    protected LinearLayoutManager linearLayoutManager;
    protected DividerItemDecoration dividerItemDecoration;
    protected RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartList = findViewById(R.id.recycler_cart);
        adapter = new CartAdaptor(getApplicationContext(), GlobalClass.cart);

    }
}
