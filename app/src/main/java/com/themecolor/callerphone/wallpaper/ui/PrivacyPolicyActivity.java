package com.themecolor.callerphone.wallpaper.ui;


import static com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.MainActivity;
import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.StartupActivity;

public class PrivacyPolicyActivity extends AppCompatActivity {

    ConstraintLayout startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        Drawable background = getResources().getDrawable(R.drawable.status_gradient);
        getWindow().setBackgroundDrawable(background);
        startBtn = findViewById(R.id.btn_next);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    startActivity(new Intent(PrivacyPolicyActivity.this, StartupActivity.class));
                });
            }
        });
    }

}