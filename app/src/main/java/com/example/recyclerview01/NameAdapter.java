package com.example.recyclerview01;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    List<String> nameList;
    Context context;

    public NameAdapter(List<String> nameList, Context context) {
        this.nameList = nameList;
        this.context = context;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_name,parent,false);
        NameViewHolder nameViewHolder=new NameViewHolder(view);

        return nameViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        String name= nameList.get(position);
        holder.textView.setText(name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,RiyadhActivity.class);
                intent.putExtra("name",name);
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
