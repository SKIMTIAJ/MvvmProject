package com.imtiaj.databindingproject.recyclerview_mvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.imtiaj.databindingproject.R;
import com.imtiaj.databindingproject.recyclerview_mvvm.model.ModelClass;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdaper extends RecyclerView.Adapter<RecyclerviewAdaper.Viewholder> {

    private Context mContext;
    private List<ModelClass> dataList;

    public RecyclerviewAdaper(Context mContext, List<ModelClass> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerviewAdaper.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.simple_mvvm,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdaper.Viewholder holder, int position) {

        holder.mvvMRecycler.setText(dataList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView mvvMRecycler;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            mvvMRecycler = itemView.findViewById(R.id.mvvMRecycler);
        }
    }
}
