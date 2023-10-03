package com.themecolor.callerphone.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.themecolor.callerphone.wallpaper.databinding.ActivityStartupBinding;

public class StartupActivity extends AppCompatActivity {

    ActivityStartupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        Drawable background  = ContextCompat.getDrawable(StartupActivity.this, R.drawable.status_gradient);
        getWindow().setBackgroundDrawable(background);
        initBtn();


        binding.btnTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("state", "All");
                startActivity(intent);
            }
        });

        binding.btnCallerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("state", "callericon");
                startActivity(intent);
            }
        });

        binding.btnCallerKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("state", "keyboard");
                startActivity(intent);
            }
        });

    }



    private void initBtn() {

        binding.btnTrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Trending");
                startActivity(intent);
            }
        });
        binding.btnNeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Neon");
                startActivity(intent);
            }
        });
        binding.btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Love");
                startActivity(intent);
            }
        });
        binding.btnCute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Cute");
                startActivity(intent);
            }
        });
        binding.btnKpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Kpop");
                startActivity(intent);
            }
        });
        binding.btnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                intent.putExtra("category", "Animal");
                startActivity(intent);
            }
        });

    }
}