package com.example.bank_balance_check;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewData> {

    Activity activity;
    List<ModelData> l1;

    public RVAdapter(MainActivity mainActivity, List<ModelData> l1) {
        activity = mainActivity;
        this.l1 = l1;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.bank_list,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {

        holder.txtBankName.setText(l1.get(position).getBankName());
        holder.imgBank.setImageResource(l1.get(position).getBankImage());

        holder.imgBank.setOnClickListener(view -> {
            Intent intent = new Intent(activity,bank_Detail_page.class);

            intent.putExtra("imgOfBank",l1.get(position).getBankImage());
            intent.putExtra("numberOfBank",l1.get(position).getBankNumber());
            activity.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    class ViewData extends RecyclerView.ViewHolder {
        TextView txtBankName;
        ImageView imgBank;
        public ViewData(@NonNull View itemView) {
            super(itemView);
            imgBank = itemView.findViewById(R.id.imgBank);
            txtBankName = itemView.findViewById(R.id.txtBankName);
        }
    }
}
