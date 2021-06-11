package com.example.logcathealth.ui.DocCorner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.R;

import java.util.List;

import com.example.logcathealth.R;

public class DocCornerAdapter extends RecyclerView.Adapter<DocCornerAdapter.DocCornerViewHolder> {

    List<DocCornerItem> mdata;

    public DocCornerAdapter(List<DocCornerItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public DocCornerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doccorner,parent,false);
        return new DocCornerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DocCornerViewHolder holder, int position) {
        holder.doc_mail.setText(mdata.get(position).getDoc_mail());
        holder.doc_name.setText(mdata.get(position).getDoc_name());
        holder.author_icon.setImageResource(mdata.get(position).getAuthor_icon());
        holder.doc_ph.setText(mdata.get(position).getDoc_ph());
        holder.spec.setText(mdata.get(position).getSpec());
        holder.available.setText(mdata.get(position).getAvailable());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class DocCornerViewHolder extends RecyclerView.ViewHolder {

        TextView doc_name,doc_ph, doc_mail, available, spec;
        ImageView author_icon;

        public DocCornerViewHolder(@NonNull View itemView) {
            super(itemView);

            doc_name=itemView.findViewById(R.id.doc_name);
            doc_ph=itemView.findViewById(R.id.doc_ph);
            doc_mail=itemView.findViewById(R.id.doc_mail);
            spec=itemView.findViewById(R.id.spec);
            author_icon=itemView.findViewById(R.id.author_icon);
            available=itemView.findViewById(R.id.available);
        }
    }
}
