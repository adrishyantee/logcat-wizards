package com.example.logcathealth.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.R;

import org.jetbrains.annotations.NotNull;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;

    public RecyclerViewAdapter() {
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerViewAdapter.ViewHolder holder, int position) {
        //populate
//        holder.Docname.setText();
//        holder.spec.setText();
//        holder.Docph.setText();
//        holder.Docmail.setText();
//        holder.available.setText();

    }

    @Override
    public int getItemCount() {
        //size of list
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView Docname, spec, Docph,Docmail, available;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            Docname=itemView.findViewById(R.id.Docname);
            spec=itemView.findViewById(R.id.spec);
            Docph=itemView.findViewById(R.id.Docph);
            Docmail=itemView.findViewById(R.id.Docmail);
            available=itemView.findViewById(R.id.available);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
