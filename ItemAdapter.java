package com.aditi.samachar;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
     private List<ListItem> listItems;
     private Context context;

    public ItemAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListItem listItem = listItems.get(i);

        viewHolder.th.setText(listItem.getHeading());
        viewHolder.td.setText(listItem.getDescription());
        viewHolder.url.setText(listItem.getImageurl());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView th;
        public TextView td;
        public TextView url;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            th=(TextView)itemView.findViewById(R.id.Heading);
            td=(TextView) itemView.findViewById(R.id.Description);
            url=(TextView) itemView.findViewById(R.id.Url);
        }
    }
}
