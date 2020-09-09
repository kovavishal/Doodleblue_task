package com.example.doodleblue_project.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doodleblue_project.R;

import java.util.List;

public class AvailableAdapter extends RecyclerView.Adapter<AvailableAdapter.MyViewHolder> {
    Context mContext;
    List<AvailableListItem> AvailableData;

    public AvailableAdapter() {
    }

    public AvailableAdapter(Context mContext, List<AvailableListItem> availableData) {
        this.mContext = mContext;
        AvailableData = availableData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.available_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableAdapter.MyViewHolder holder, int position) {
        holder.productName.setText(AvailableData.get(position).getProductName());
        holder.rating.setText(AvailableData.get(position).getRating());
        holder.countryCode.setText(AvailableData.get(position).getCountryCode());
        holder.size.setText(AvailableData.get(position).getSize());
        holder.rate.setText(AvailableData.get(position).getRate());
        holder.date.setText(AvailableData.get(position).getDate());
        holder.retaillerName.setText(AvailableData.get(position).getRetailerName());
    }

    @Override
    public int getItemCount() {
        return AvailableData.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{


        private TextView productName;
        private TextView rating;
        private TextView countryCode;
        private TextView size;
        private TextView rate;
        private TextView date;
        private TextView retaillerName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = (TextView)itemView.findViewById(R.id.product_name);
            rating = (TextView)itemView.findViewById(R.id.rating);
            countryCode = (TextView)itemView.findViewById(R.id.countrycode);
            size = (TextView)itemView.findViewById(R.id.size);
            rate = (TextView)itemView.findViewById(R.id.rate);
            date = (TextView)itemView.findViewById(R.id.date);
            retaillerName = (TextView)itemView.findViewById(R.id.retailerName);
        }
    }
}
