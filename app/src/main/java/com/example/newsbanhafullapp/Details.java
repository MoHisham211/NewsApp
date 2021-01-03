package com.example.newsbanhafullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Details extends AppCompatActivity {

    private String image,title,description,link,publishedAt;
    private ImageView imageView;
    private TextView textViewTitle,textViewDescription,textViewPublish;
    private Button buttonSource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView=findViewById(R.id.app_bar_image);
        textViewTitle=findViewById(R.id.title);
        textViewDescription=findViewById(R.id.description);
        textViewPublish=findViewById(R.id.publish);
        buttonSource=findViewById(R.id.button);
        image=getIntent().getStringExtra("Image");
        title=getIntent().getStringExtra("Title");
        description=getIntent().getStringExtra("Desc");
        link=getIntent().getStringExtra("Link");
        publishedAt=getIntent().getStringExtra("publishedAt");
        loadDetails();
        buttonSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse(link);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }
    private void loadDetails(){
        textViewTitle.setText(title);
        textViewDescription.setText(description);
        textViewPublish.setText(publishedAt);
        if (image!=null && !image.isEmpty())
            Picasso
                    .get()
                    .load(image)
                    .placeholder(R.drawable.ic_baseline_insert_photo_24)
                    .into(imageView);
        else
            imageView.setImageResource(R.drawable.ic_baseline_broken_image_24);


    }
}