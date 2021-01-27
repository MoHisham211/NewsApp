package com.example.newsbanhafullapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    //https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=99410b4dcd75422c8cf062e7e4b1cc8b
    private String sentCategory;
    private String lang;
    private SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentCategory=getIntent().getStringExtra(Constance.CATEGORY_KEY);
        lang=getIntent().getStringExtra(Constance.LANG_KEY);

        lodeData(sentCategory,lang);
        swipeRefreshLayout=findViewById(R.id.swiperefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(false);
                lodeData(sentCategory,lang);
            }
        });
    }

    private void showListView(ArrayList<Article> articles) {
        CustomAdapter adapter=new CustomAdapter(articles,this);
        RecyclerView rv=findViewById(R.id.rv);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
        rv.addOnItemTouchListener(
                new RecyclerItemClickListener(this, rv ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent=new Intent(MainActivity.this,Details.class);
                        intent.putExtra("Image",articles.get(position).getUrlToImage());
                        intent.putExtra("Title",articles.get(position).getTitle());
                        intent.putExtra("Desc",articles.get(position).getDescription());
                        intent.putExtra("Link",articles.get(position).getUrl());
                        intent.putExtra("publishedAt",articles.get(position).getPublishedAt());
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }

    private void lodeData(String Category,String Lang)
    {
        ProgressBar progressBar=findViewById(R.id.pb);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://newsapi.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CallableInterface callable=retrofit.create(CallableInterface.class);
        Call<NewsModel> newsModelCall=callable.getData(Category,Lang);

        newsModelCall.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {

                progressBar.setVisibility(View.GONE);
                NewsModel newsModel=response.body();
                ArrayList<Article>articles=newsModel.getArticles();
                showListView(articles);
                Log.d("TAGJSON",""+newsModel.articles.get(0).getUrlToImage());
            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Log.d("TAGJSON","Error : "+t.getMessage());
            }
        });
    }
}