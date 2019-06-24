package com.chuhieu.recyclerview_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Products> arrproducts;
    private ProductAdapter productAdapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.rc_name);
        arrproducts = new ArrayList<>();

        for (int i = 0; i <30 ; i++) {
            Products product = new Products();
            product.setName("Chu Hieu");
            product.setId(""+(i+1));
            arrproducts.add(product);
        }
        productAdapter = new ProductAdapter(arrproducts,MainActivity.this);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(productAdapter);

    }
}
