package com.example.newsbanhafullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.Key;

public class HomeActivity extends AppCompatActivity {
    private FloatingActionButton settingBtn;
    private String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE);
        lang = sharedPreferences.getString(Constance.LANG_KEY,"Us");


        settingBtn=findViewById(R.id.setting);
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,SettingActivity.class));
                finish();
            }
        });

    }
    public void open_health(View view) {
        openMain("health",lang);
    }

    public void open_science(View view) {
        openMain("science",lang);
    }

    public void open_sports(View view) {
        openMain("sports",lang);
    }

    public void open_technology(View view) {
        openMain("technology",lang);
    }

    public void open_general(View view) {
        openMain("general",lang);
    }

    public void open_entertainment(View view) {
        openMain("entertainment",lang);
    }

    public void open_business(View view) {
        openMain("business",lang);
    }
    public void openMain(String key,String Lang)
    {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra(Constance.CATEGORY_KEY,key);
        intent.putExtra(Constance.LANG_KEY,Lang);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        ExitDailog exitDailog=new ExitDailog();
        exitDailog.show(getSupportFragmentManager(),"");
        exitDailog.setCancelable(false);
    }
}