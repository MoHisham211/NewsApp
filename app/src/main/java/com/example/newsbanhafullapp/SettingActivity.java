package com.example.newsbanhafullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15
            ,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28;
    private SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn1=findViewById(R.id.eg);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "eg");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"eg");
                startActivity(intent);
                finish();
            }
        });

        btn2=findViewById(R.id.us);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "us");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"us");
                startActivity(intent);
                finish();
            }
        });


        btn3=findViewById(R.id.ae);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "ae");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"ae");
                startActivity(intent);
                finish();
            }
        });
        btn4=findViewById(R.id.ar);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "ar");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"ar");
                startActivity(intent);
                finish();
            }
        });
        btn5=findViewById(R.id.at);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "at");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"at");
                startActivity(intent);
                finish();
            }
        });
        btn6=findViewById(R.id.au);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "au");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"au");
                startActivity(intent);
                finish();
            }
        });
        btn7=findViewById(R.id.be);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "be");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"be");
                startActivity(intent);
                finish();
            }
        });
        btn8=findViewById(R.id.bg);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "bg");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"bg");
                startActivity(intent);
                finish();
            }
        });
        btn9=findViewById(R.id.br);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "br");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"br");
                startActivity(intent);
                finish();
            }
        });
        btn10=findViewById(R.id.ca);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "ca");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"ca");
                startActivity(intent);
                finish();
            }
        });btn11=findViewById(R.id.ch);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "ch");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"ch");
                startActivity(intent);
                finish();
            }
        });btn12=findViewById(R.id.cn);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "cn");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"cn");
                startActivity(intent);
                finish();
            }
        });btn13=findViewById(R.id.co);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "co");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"co");
                startActivity(intent);
                finish();
            }
        });btn14=findViewById(R.id.cu);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "cu");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"cu");
                startActivity(intent);
                finish();
            }
        });btn15=findViewById(R.id.cz);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "cz");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"cz");
                startActivity(intent);
                finish();
            }
        });btn16=findViewById(R.id.de);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "de");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"de");
                startActivity(intent);
                finish();
            }
        });btn17=findViewById(R.id.fr);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "fr");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"fr");
                startActivity(intent);
                finish();
            }
        });btn18=findViewById(R.id.gb);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "gb");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"gb");
                startActivity(intent);
                finish();
            }
        });btn19=findViewById(R.id.gr);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "gr");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"gr");
                startActivity(intent);
                finish();
            }
        });btn20=findViewById(R.id.hk);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "hk");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"hk");
                startActivity(intent);
                finish();
            }
        });btn21=findViewById(R.id.hu);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "hu");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"hu");
                startActivity(intent);
                finish();
            }
        });btn22=findViewById(R.id.id);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "id");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"id");
                startActivity(intent);
                finish();
            }
        });btn23=findViewById(R.id.ie);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "ie");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"ie");
                startActivity(intent);
                finish();
            }
        });btn24=findViewById(R.id.il);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "il");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"il");
                startActivity(intent);
                finish();
            }
        });btn25=findViewById(R.id.in);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "in");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"in");
                startActivity(intent);
                finish();
            }
        });btn26=findViewById(R.id.it);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "it");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"it");
                startActivity(intent);
                finish();
            }
        });btn27=findViewById(R.id.jp);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "jp");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"jp");
                startActivity(intent);
                finish();
            }
        });btn28=findViewById(R.id.kr);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,HomeActivity.class);
                sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(Constance.LANG_KEY, "kr");
                editor.apply();
                intent.putExtra(Constance.LANG_KEY,"kr");
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
        super.onBackPressed();

    }
}