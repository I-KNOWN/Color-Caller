package com.themecolor.callerphone.wallpaper.ui;



import static com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.adapter.IndicatorAdapter;
import com.themecolor.callerphone.wallpaper.databinding.ActivityOnBoardingBinding;
import com.themecolor.callerphone.wallpaper.utils.PrefManager;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {
    ActivityOnBoardingBinding binding;
    PrefManager prefManager;
    LinearLayout adsView0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOnBoardingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adsView0=findViewById(R.id.adsView0);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        prefManager = new PrefManager(this);

        setUpUi();
        addIndicator(0);
    }

    private void setUpUi() {

        binding.viewPager.setAdapter(new IndicatorAdapter(3));
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                addIndicator(position);
                if (position < 2) {
                    binding.txtNext.setVisibility(View.VISIBLE);
                    binding.llIndicator.setVisibility(View.VISIBLE);
                    binding.tvNext.setText("Next");
                } else {
                    binding.llIndicator.setVisibility(View.VISIBLE);
                    binding.tvNext.setText("Start");
//                    binding.txtNext.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }


            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        binding.txtNext.setOnClickListener(v -> {

            AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                if (binding.tvNext.getText().equals("Next")) {
                    int current = getItem(+1);
                    if (current < 3) {
                        binding.viewPager.setCurrentItem(current);
                    }
                } else {
                    startActivity(new Intent(OnBoardingActivity.this, PrivacyPolicyActivity.class));
                }
            });





        });



    }


    private int getItem(int i) {
        return binding.viewPager.getCurrentItem() + i;
    }

    private void addIndicator(int position) {
        List<ImageView> pages = new ArrayList<>();
        pages.clear();
        pages.add(binding.textView2);
        pages.add(binding.textView3);
        pages.add(binding.textView4);

        for (int i = 0; i < pages.size(); i++) {
//            pages.get(i).setText(Html.fromHtml("&#8226;"));
            pages.get(i).setBackground(getResources().getDrawable(R.drawable.filled));
            if (i == position) {
                pages.get(i).setBackground(getResources().getDrawable(R.drawable.filled));
            } else {
                pages.get(i).setBackground(getResources().getDrawable(R.drawable.outline));
            }
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
}