package com.themecolor.callerphone.wallpaper.callertheme.categoryui;



import static com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;


import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.themecolor.callerphone.wallpaper.R;
import com.themecolor.callerphone.wallpaper.callertheme.categoryui.linearCategory.kpopCategory.ViewPagerAdapter;

import java.util.ArrayList;

public class CategoryShowActivity extends AppCompatActivity {
    private static final String TAG = "CategoryShowActivity";
    private ArrayList<Images> lstImages = new ArrayList<>();
    ImageView back;
    private int clickedPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_show);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ViewPager viewPager = findViewById(R.id.view_pager);
        back = findViewById(R.id.back);
        ArrayList<String> parcelableArrayList = getIntent().getStringArrayListExtra("imageUrl");
/*        if (parcelableArrayList != null) {
            for (Parcelable parcelable : parcelableArrayList) {
                if (parcelable instanceof Images) {
                    Images image = (Images) parcelable;
                    lstImages.add(image);
                }
            }
        }*/
        clickedPosition = getIntent().getIntExtra("position", 0);
        Log.println(Log.ASSERT, TAG, "lstImages: " + parcelableArrayList.size());


        ViewPagerAdapter adapter = new ViewPagerAdapter(this, parcelableArrayList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(clickedPosition);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        onBackPressed();

            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onBackPressed() {

        AdUtils.showBackPressAds(activity, Constants.adsResponseModel.getApp_open_ads().getAdx(), state_load -> {
            CategoryShowActivity.super.onBackPressed();
        });

    }
}