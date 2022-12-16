package com.mbkm.project4.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mbkm.project4.Model.BusModel;
import com.mbkm.project4.Model.PlacesData;
import com.mbkm.project4.R;
import com.mbkm.project4.details_activity;

import java.util.List;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.BusDataViewHolder> {

    Context context;
    List<BusModel> busModelList;

    public BusAdapter(Context context, List<BusModel> busModelList) {
        this.context = context;
        this.busModelList = busModelList;
    }

    @NonNull
    @Override
    public BusAdapter.BusDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_bus, parent, false);

        // here we create a recyclerview list item layout file
        return new BusAdapter.BusDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BusAdapter.BusDataViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.desk.setText(busModelList.get(position).getDesk());
        holder.busName.setText(busModelList.get(position).getBusName());
        holder.price.setText(busModelList.get(position).getPrice());
        holder.busImage.setImageResource(busModelList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "anda memilih " + busModelList.get(position).getBusName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, details_activity.class);

                intent.putExtra("busName", busModelList.get(position).getBusName());
                intent.putExtra("desk", busModelList.get(position).getDesk());
                intent.putExtra("price", busModelList.get(position).getPrice());
                intent.putExtra("busImage", busModelList.get(position).getImageUrl());

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return busModelList.size();
    }

    public class BusDataViewHolder extends RecyclerView.ViewHolder {
        ImageView busImage;
        TextView busName, desk, price;

        public BusDataViewHolder(@NonNull View itemView) {
            super(itemView);

            busImage = itemView.findViewById(R.id.bus_image);
            busName = itemView.findViewById(R.id.bus_name);
            desk = itemView.findViewById(R.id.desk);
            price = itemView.findViewById(R.id.price);
        }
    }
}
