package com.example.deadlock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
ImageView imageView;
Animation animation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activiy);
        animation = AnimationUtils.loadAnimation(this,R.anim.splash_logo_animation);

        imageView = (ImageView) findViewById(R.id.splash_screen_logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setAnimation(animation);
            }
        },2500);


    }
}