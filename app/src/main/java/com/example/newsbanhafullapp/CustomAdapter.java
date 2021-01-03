package com.example.newsbanhafullapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Article> articles;
    private Activity activity;

    public CustomAdapter(ArrayList<Article> articles, Activity activity) {
        this.articles = articles;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return articles.size();
    }

    @Override
    public Object getItem(int position) {
        return articles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
            convertView= activity.getLayoutInflater().inflate(R.layout.list_item,parent,false);

        TextView tvTitle=convertView.findViewById(R.id.tv);
        ImageView imageView=convertView.findViewById(R.id.iv);

        tvTitle.setText(articles.get(position).getTitle());

       String dwonloadedImage=articles.get(position).getUrlToImage();

        if (dwonloadedImage!=null && !dwonloadedImage.isEmpty())
        Picasso
                .get()
                .load(articles.get(position).getUrlToImage())
                .placeholder(R.drawable.ic_baseline_insert_photo_24)
                .into(imageView);
        else
            imageView.setImageResource(R.drawable.ic_baseline_broken_image_24);

        return convertView;
    }
}
