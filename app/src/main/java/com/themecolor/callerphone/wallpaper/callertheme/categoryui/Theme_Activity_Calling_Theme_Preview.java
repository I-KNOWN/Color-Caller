package com.themecolor.callerphone.wallpaper.callertheme.categoryui;


import static com.themecolor.callerphone.wallpaper.utils.GifDrawableUtil.pxFromDp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.role.RoleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.themecolor.callerphone.wallpaper.MainActivity;
import com.themecolor.callerphone.wallpaper.R;
import com.squareup.picasso.Picasso;
import com.themecolor.callerphone.wallpaper.callertheme.OS.DialogSetting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import pl.droidsonroids.gif.GifImageView;

public class Theme_Activity_Calling_Theme_Preview extends AppCompatActivity {
    ImageView imageView, favourites;
    GifImageView gifimageView;
    TextView btn_set_theam;
    private GridView gridView;
    private ArrayList<DataClass> dataList;
    ImageView img_recive, img_reject, back1;


    SharedPreferences sharedpreferences;

    private String selectedImageUrl;

    LinearLayout leftArrowContainer, rightArrowContainer, adsView0;
    public static final String FAVORITES_PREF_NAME = "my_favorites_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_calling_theme_preview);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView = findViewById(R.id.image_view_preview);

       // AppManage.getInstance(Theme_Activity_Calling_Theme_Preview.this).showNativeBanner((ViewGroup) adsView0, ADMOB_N[0], FACEBOOK_N[0]);
        btn_set_theam = findViewById(R.id.btn_set_theam);
        back1 = findViewById(R.id.back1);
        favourites = findViewById(R.id.favourites);
        img_recive = findViewById(R.id.img_recive);
        img_reject = findViewById(R.id.img_reject);
        dataList = new ArrayList<>();

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                startActivity(new Intent(Theme_Activity_Calling_Theme_Preview.this, MainActivity.class));
            }
        });
        String imageUrl = getIntent().getStringExtra("image_url");
        Picasso.get().load(imageUrl).into(imageView);
        SharedPreferences sharedPreferences = getSharedPreferences(FAVORITES_PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favoriteUrls = sharedPreferences.getStringSet("favorite_urls", new HashSet<>());

        // Check if the current image URL is in the list of favorite URLs
        if (imageUrl != null && favoriteUrls.contains(imageUrl)) {
            // Set the color of the favorite button to red
            favourites.setColorFilter(ContextCompat.getColor(Theme_Activity_Calling_Theme_Preview.this, R.color.red));
        }
        leftArrowContainer = findViewById(R.id.left_arrow_container);
        rightArrowContainer = findViewById(R.id.right_arrow_container);

        ObjectAnimator leftArrow1Animator = ObjectAnimator.ofFloat(leftArrowContainer.getChildAt(0), "translationX", -40f);
        ObjectAnimator leftArrow2Animator = ObjectAnimator.ofFloat(leftArrowContainer.getChildAt(1), "translationX", -40f);
        ObjectAnimator rightArrow1Animator = ObjectAnimator.ofFloat(rightArrowContainer.getChildAt(0), "translationX", 40f);
        ObjectAnimator rightArrow2Animator = ObjectAnimator.ofFloat(rightArrowContainer.getChildAt(1), "translationX", 40f);


        AnimatorSet leftArrowAnimatorSet = new AnimatorSet();
        leftArrowAnimatorSet.playSequentially(leftArrow1Animator, leftArrow2Animator

        );
        leftArrowAnimatorSet.setDuration(500);
        leftArrowAnimatorSet.setStartDelay(200);

        AnimatorSet rightArrowAnimatorSet = new AnimatorSet();
        rightArrowAnimatorSet.playSequentially(rightArrow1Animator, rightArrow2Animator

        );
        rightArrowAnimatorSet.setDuration(500);
        rightArrowAnimatorSet.setStartDelay(200);


        img_recive.setOnTouchListener(new SwipeTouchListener(leftArrowContainer, rightArrowContainer, img_recive, ((int) pxFromDp(Theme_Activity_Calling_Theme_Preview.this, 90)) / 2));
        img_reject.setOnTouchListener(new SwipeTouchListener(leftArrowContainer, rightArrowContainer, img_reject, ((int) pxFromDp(Theme_Activity_Calling_Theme_Preview.this, 90)) / 2));


        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToFavoritesIfImageSet(imageUrl);
            }
        });

        btn_set_theam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TelecomManager telecomManager = (TelecomManager) getSystemService(Context.TELECOM_SERVICE);
                if (telecomManager != null && !getPackageName().equals(telecomManager.getDefaultDialerPackage())) {
                    if (telecomManager == null || getPackageName().equals(telecomManager.getDefaultDialerPackage())) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        RoleManager roleManager = (RoleManager) getSystemService(RoleManager.class);
                        if (roleManager.isRoleAvailable("android.app.role.DIALER") && !roleManager.isRoleHeld("android.app.role.DIALER")) {
                            startActivityForResult(roleManager.createRequestRoleIntent("android.app.role.DIALER"), 1);
                            return;
                        }
                    }
                    requestDefault();
                }else{
                    SharedPreferences sharedPreferences = getSharedPreferences("image_theme", Context.MODE_PRIVATE);

                    if (imageUrl != null) {
                        // Perform the necessary actions with the downloaded image URL
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("image_url1", imageUrl);
                        editor.putLong("timestamp", System.currentTimeMillis());
                        editor.apply();

                        selectedImageUrl = imageUrl;
                        Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Applied Successfully", Toast.LENGTH_SHORT).show();
//                    // Add to favorites only if the image is set successfully
//                    addToFavoritesIfImageSet(imageUrl);
                    } else {
                        Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                }






            }
        });


    }

    private void requestDefault() {
 /*       RoleManager roleManager = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            roleManager = getSystemService(RoleManager.class);
        }
        if (roleManager != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                if (roleManager.isRoleAvailable(RoleManager.ROLE_DIALER) && !roleManager.isRoleHeld(RoleManager.ROLE_DIALER)) {
                    Intent intent = roleManager.createRequestRoleIntent(RoleManager.ROLE_DIALER);
                    startActivityForResult(intent, 123);
                } else {
                    showDefaultSettingDialog();
                }
            }
        } else {
            showDefaultSettingDialog();
        }*/
        try {
            Intent intent = new Intent("android.telecom.action.CHANGE_DEFAULT_DIALER");
            intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", getPackageName());
            startActivityForResult(intent, 123);
        } catch (ActivityNotFoundException unused) {
            new DialogSetting(this).show();
        }
    }
    private void addToFavoritesIfImageSet(String imageUrl) {
        SharedPreferences sharedPreferences = getSharedPreferences(FAVORITES_PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favoriteUrls = sharedPreferences.getStringSet("favorite_urls", new HashSet<>());

        if (imageUrl != null) {
            if (favoriteUrls.contains(imageUrl)) {
                // Item is already marked as favorite, remove it from favorites
                favoriteUrls.remove(imageUrl);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putStringSet("favorite_urls", favoriteUrls);
                editor.apply();
                favourites.setColorFilter(null); // Reset color to default
                Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Removed from Favorites", Toast.LENGTH_SHORT).show();
            } else {
                // Item is not marked as favorite, add it to the favorites list
                favoriteUrls.add(imageUrl);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putStringSet("favorite_urls", favoriteUrls);
                editor.apply();
                favourites.setColorFilter(ContextCompat.getColor(Theme_Activity_Calling_Theme_Preview.this, R.color.red));
                Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Added to Favorites", Toast.LENGTH_SHORT).show();
            }
        }
    }

/*    private void addToFavoritesIfImageSet(String imageUrl) {
        SharedPreferences sharedPreferences = getSharedPreferences(FAVORITES_PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favoriteUrls = sharedPreferences.getStringSet("favorite_urls", new HashSet<>());

        if (imageUrl != null) {
            if (favoriteUrls.contains(imageUrl)) {
                // Item is already marked as favorite
                Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Already in Favorites", Toast.LENGTH_SHORT).show();
            } else {
                // Item is not marked as favorite, add it to the favorites list
                favoriteUrls.add(imageUrl);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putStringSet("favorite_urls", favoriteUrls);
                editor.apply();
                favourites.setColorFilter(ContextCompat.getColor(Theme_Activity_Calling_Theme_Preview.this, R.color.red));

                Toast.makeText(Theme_Activity_Calling_Theme_Preview.this, "Added to Favorites", Toast.LENGTH_SHORT).show();
            }
        }
    }*/


    static class SwipeTouchListener implements View.OnTouchListener {
        private LinearLayout leftArrowContainer;
        private LinearLayout rightArrowContainer;
        private ImageView leftArrow1;
        private ImageView leftArrow2;

        private ImageView rightArrow1;
        private ImageView rightArrow2;

        private boolean isSwiping = false;
        private float initialX;
        private ImageView buttonView;
        private ObjectAnimator fadeOutAnimator;
        private ObjectAnimator fadeInAnimator;
        public int getHalfImgHight = 0;


        SwipeTouchListener(LinearLayout leftArrowContainer, LinearLayout rightArrowContainer, ImageView buttonView, int getHalfImgHight) {
            this.leftArrowContainer = leftArrowContainer;
            this.rightArrowContainer = rightArrowContainer;
            this.buttonView = buttonView;

            leftArrow1 = leftArrowContainer.findViewById(R.id.left_arrow_1);
            leftArrow2 = leftArrowContainer.findViewById(R.id.left_arrow_2);
            rightArrow1 = rightArrowContainer.findViewById(R.id.right_arrow_1);
            rightArrow2 = rightArrowContainer.findViewById(R.id.right_arrow_2);

            fadeOutAnimator = ObjectAnimator.ofFloat(buttonView, "alpha", 1f, 0.5f);
            fadeOutAnimator.setDuration(200);
            fadeOutAnimator.setInterpolator(new LinearInterpolator());

            fadeInAnimator = ObjectAnimator.ofFloat(buttonView, "alpha", 0.5f, 1f);
            fadeInAnimator.setDuration(200);
            fadeInAnimator.setInterpolator(new LinearInterpolator());

            this.getHalfImgHight = getHalfImgHight ;


        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    isSwiping = false;
                    initialX = event.getX();
                    showArrows();
                    fadeOutAnimator.cancel();
                    fadeInAnimator.cancel();
                    if(buttonView != null)
                    buttonView.setAlpha(1f);
                    return true;
                case MotionEvent.ACTION_MOVE:
                    if (!isSwiping && Math.abs(event.getX() - initialX) > 100) {
                        isSwiping = true;
                    }
                    if (isSwiping) {
                        if(buttonView!=null){
                            buttonView.setX((event.getRawX() - getHalfImgHight)/* - initialX*/);
                            fadeOutAnimator.start();
                        }

                    }
                    return true;
                case MotionEvent.ACTION_UP:
                    hideArrows();
                    if (isSwiping) {
                        float deltaX = event.getX() - initialX;
                        if (deltaX > 0) {
                            // Swiped right
                            // Handle receive call action here
                        } else {
                            // Swiped left
                            // Handle end call action here
                        }
                    }
                    buttonView.setTranslationX(0f);
                    fadeInAnimator.start();
                    return true;
            }
            return false;
        }

        private void showArrows() {
            leftArrow1.setVisibility(View.VISIBLE);
            leftArrow1.setTranslationX(-50);
            leftArrow1.setAlpha(0f);
            leftArrow1.animate().translationXBy(50).alpha(1f).setDuration(200).start();

            leftArrow2.setVisibility(View.VISIBLE);
            leftArrow2.setTranslationX(-50);
            leftArrow2.setAlpha(0f);
            leftArrow2.animate().translationXBy(50).alpha(1f).setStartDelay(100).setDuration(200).start();


            rightArrow1.setVisibility(View.VISIBLE);
            rightArrow1.setTranslationX(50);
            rightArrow1.setAlpha(0f);
            rightArrow1.animate().translationXBy(-50).alpha(1f).setDuration(200).start();

            rightArrow2.setVisibility(View.VISIBLE);
            rightArrow2.setTranslationX(50);
            rightArrow2.setAlpha(0f);
            rightArrow2.animate().translationXBy(-50).alpha(1f).setStartDelay(100).setDuration(200).start();


        }


        private void hideArrows() {
            leftArrow1.animate().translationXBy(50).alpha(0f).setDuration(200).start();
            leftArrow2.animate().translationXBy(50).alpha(0f).setDuration(200).start();
            rightArrow1.animate().translationXBy(-50).alpha(0f).setDuration(200).start();
            rightArrow2.animate().translationXBy(-50).alpha(0f).setDuration(200).start();
        }
    }


    @Override
    public void onBackPressed() {
            finish();

//        Intent intent= new Intent(Theme_Activity_Calling_Theme_Preview.this, MainActivity.class);
//        intent.putExtra("prev", "all");
//        startActivity(intent);

    }
}
