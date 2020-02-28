package com.example.againrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapterSetting extends  RecyclerView.Adapter<adapterSetting.viewholder> {
  Context context;
  List<users> items;
    public adapterSetting(Context context, List<users> users) {
        this.context = context;
        this.items = users;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.design_layout,parent,false);
        viewholder viewholder = new viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull final viewholder holder, int position) {
        final users users = items.get(position);
        holder.no.setText(""+users.getId());
        holder.text.setText(""+users.getText());
        holder.img.setImageDrawable(users.getImg());

        holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context,com.example.againrecyclerview.ViewActivity.class);
                it.putExtra("urls",""+ users.getUrl());
            context.startActivity(it);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  class  viewholder extends RecyclerView.ViewHolder{

        TextView no;
        TextView text;
        ImageView img;
        LinearLayout ll;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            no = itemView.findViewById(R.id.id);
            text = itemView.findViewById(R.id.text);
            img = itemView.findViewById(R.id.img);
            ll = itemView.findViewById(R.id.ll);

        }
    }

}
