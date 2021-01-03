package com.example.newsbanhafullapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


import com.daimajia.androidanimations.library.Techniques;

import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashActivity extends AwesomeSplash {



    @Override
    public void initSplash(ConfigSplash configSplash) {

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.purple_500); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        configSplash.setLogoSplash(R.drawable.ic_news2); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeIn); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


        //Customize Title
        configSplash.setTitleSplash("News");
        configSplash.setTitleTextColor(R.color.colorDelete);
        configSplash.setTitleTextSize(35f); //float value
        configSplash.setAnimTitleDuration(2500);
        configSplash.setAnimTitleTechnique(Techniques.Bounce);

    }

    @Override
    public void animationsFinished() {
        openActivity();
    }

    @Override
    public void onBackPressed() {
    }
    private void openActivity()
    {
        startActivity(new Intent(SplashActivity.this, HomeActivity.class));
        finish();
    }
}