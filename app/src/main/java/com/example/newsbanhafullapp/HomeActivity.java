package com.example.newsbanhafullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.security.Key;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }


    public void open_health(View view) {
        openMain("health");
    }

    public void open_science(View view) {
        openMain("science");
    }

    public void open_sports(View view) {
        openMain("sports");
    }

    public void open_technology(View view) {
        openMain("technology");
    }

    public void open_general(View view) {
        openMain("general");
    }

    public void open_entertainment(View view) {
        openMain("entertainment");
    }

    public void open_business(View view) {
        openMain("business");
    }
    public void openMain(String key)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra(Constance.CATEGORY_KEY,key);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        ExitDailog exitDailog=new ExitDailog();
        exitDailog.show(getSupportFragmentManager(),"");
        exitDailog.setCancelable(false);
    }


}