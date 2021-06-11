package com.example.logcathealth.BottomNav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logcathealth.BottomNavigation;
import com.example.logcathealth.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    List<MenuItem> mdata;
    ClickedCallBack listener;
    public MenuAdapter(List<MenuItem> mdata, BottomNavigation listener) {
        this.mdata = mdata;
        this.listener=listener;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {
        holder.icon.setImageResource(mdata.get(position).getIcon());
        if(mdata.get(position).isSelected()){
            holder.selected.setVisibility(View.VISIBLE);
        }
        else
            holder.selected.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {

        ImageView icon,selected;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);

            icon= itemView.findViewById(R.id.menuicon);
            selected=itemView.findViewById(R.id.menu_selected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onMenuItemClick(getBindingAdapterPosition());
                }
            });
        }
    }
}
