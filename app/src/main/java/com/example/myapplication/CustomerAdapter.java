package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyViewHolder> {
    private Context context;
    ArrayList<User> data = new ArrayList<>();

    public CustomerAdapter(Context context, ArrayList<User> data){
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public CustomerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(context).inflate(R.layout.show_list,null);
        MyViewHolder myViewHolder = new MyViewHolder(convertView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.MyViewHolder holder, int position) {
        holder.tv1.setText("City:"+ data.get(position).getCity());
        holder.tv2.setText("Email:"+ data.get(position).getEmail());
        holder.tv3.setText("Lat:"+ data.get(position).getLat());
        holder.tv4.setText("Lng:"+ data.get(position).getLng());
        holder.tv5.setText("Name:"+ data.get(position).getName());
        holder.tv.setText("Street:"+ data.get(position).getStreet());



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv, tv1, tv2, tv3, tv4, tv5;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_list1);
            tv2 = itemView.findViewById(R.id.tv_list2);
            tv3 = itemView.findViewById(R.id.tv_list3);
            tv4 = itemView.findViewById(R.id.tv_list4);
            tv5 = itemView.findViewById(R.id.tv_list5);
            tv = itemView.findViewById(R.id.tv_list);
        }
    }
}
