package com.chuhieu.recyclerview_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {
    public List<Products> products;
    private Context context;


    public ProductAdapter(List<Products> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

        holder.id.setText(products.get(position).Id);
        holder.name.setText(products.get(position).Name);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        TextView id,name;

        public ProductHolder(View itemView) {
            super(itemView);
            id= itemView.findViewById(R.id.tv_id);
            name= itemView.findViewById(R.id.tv_name);
        }
    }
}
