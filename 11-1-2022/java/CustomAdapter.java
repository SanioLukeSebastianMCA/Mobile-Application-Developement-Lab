package com.example.labcycleadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ListViewHolder> {

    Context context;
    ArrayList<DataModel> plist;

    public CustomAdapter(Context context, ArrayList<DataModel> plist) {
        this.context = context;
        this.plist = plist;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list, parent, false);
        return new ListViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.item_pos.setText(""+(position+1));
        holder.item_pname.setText(plist.get(position).getPerson_name());
        holder.item_pqualify.setText(plist.get(position).getPerson_profession());
    }

    @Override
    public int getItemCount() {
        return plist.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {

        TextView item_pos, item_pname, item_pqualify;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            item_pos= itemView.findViewById(R.id.item_pos);
            item_pname= itemView.findViewById(R.id.item_pname);
            item_pqualify= itemView.findViewById(R.id.item_pqualify);
        }
    }
}
