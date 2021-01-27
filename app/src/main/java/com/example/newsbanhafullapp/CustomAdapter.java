package com.example.newsbanhafullapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<Article> articles;
    private Activity activity;

    public CustomAdapter(ArrayList<Article> articles, Activity activity) {
        this.articles = articles;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View view=inflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(articles.get(position).getTitle());
        String dwonloadedImage=articles.get(position).getUrlToImage();
        if (dwonloadedImage!=null && !dwonloadedImage.isEmpty())
            Picasso
                    .get()
                    .load(articles.get(position).getUrlToImage())
                    .placeholder(R.drawable.ic_baseline_insert_photo_24)
                    .into(holder.imageView);
        else
            holder.imageView.setImageResource(R.drawable.ic_baseline_broken_image_24);


    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
            textView=itemView.findViewById(R.id.tv);
        }
    }
}