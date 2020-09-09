package com.example.doodleblue_project.adapters;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doodleblue_project.R;

import java.text.BreakIterator;
import java.util.List;

import static android.view.LayoutInflater.from;

public class LoanedAdapter extends RecyclerView.Adapter<LoanedAdapter.MyViewHolder> {

    Context mContext;
    List<LoanedListItems> LoanedData;

    public LoanedAdapter(Context mContext, List<LoanedListItems> loanedData) {
        this.mContext = mContext;
        this.LoanedData = loanedData;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.loaned_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.productName.setText(LoanedData.get(position).getProductName());
        holder.rating.setText(LoanedData.get(position).getRating());
        holder.countryCode.setText(LoanedData.get(position).getCountryCode());
        holder.size.setText(LoanedData.get(position).getSize());
        holder.rate.setText(LoanedData.get(position).getRate());
        holder.date.setText(LoanedData.get(position).getDate());
        holder.retaillerName.setText(LoanedData.get(position).getRetailerName());

    }

    @Override
    public int getItemCount() {
        return LoanedData.size();
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
