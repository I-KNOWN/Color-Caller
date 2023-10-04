package com.themecolor.callerphone.wallpaper;

import static com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.role.RoleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.adsmodule.api.adsModule.AdUtils;
import com.adsmodule.api.adsModule.utils.Constants;
import com.permissionx.guolindev.PermissionX;
import com.permissionx.guolindev.callback.RequestCallback;
import com.themecolor.callerphone.wallpaper.callertheme.OS.DialogSetting;
import com.themecolor.callerphone.wallpaper.databinding.ActivityStartupBinding;

import java.util.List;

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

//        if (!OtherUntil.checkPer(this, "android.permission.READ_EXTERNAL_STORAGE") && !OtherUntil.checkPer(this, "android.permission.WRITE_EXTERNAL_STORAGE")&&!OtherUntil.checkPer(this, "android.permission.READ_CONTACTS")&&!OtherUntil.checkPer(this, "android.permission.CALL_PHONE")&&!OtherUntil.checkPer(this, "Manifest.permission.RECORD_AUDIO")) {
//            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.CALL_PHONE", "Manifest.permission.RECORD_AUDIO"}, 1);
//        }


        PermissionX.init(StartupActivity.this)
                .permissions(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_CONTACTS, Manifest.permission.CALL_PHONE, Manifest.permission.RECORD_AUDIO)
                .request(new RequestCallback() {
                    @Override
                    public void onResult(boolean allGranted, @NonNull List<String> grantedList, @NonNull List<String> deniedList) {
                        if (allGranted) {
                            Toast.makeText(StartupActivity.this, "All permissions are granted", Toast.LENGTH_LONG).show();
                        } else {
//                            Toast.makeText(StartupActivity.this, "These permissions are denied: $deniedList", Toast.LENGTH_LONG).show();
                        }
                    }
                });




//        startActivity(new Intent(StartupActivity.this, ActivityPerM.class));





        binding.btnTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("state", "All");
                    startActivity(intent);
                });

            }
        });


        binding.btnCallerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("state", "callericon");
                    startActivity(intent);
                });


            }
        });

        binding.btnCallerKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("state", "keyboard");
                    startActivity(intent);
                });
            }
        });

    }

    @Override
    protected void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        super.onActivityResult(i, i2, intent);
/*        TelecomManager telecomManager = (TelecomManager) getSystemService(Context.TELECOM_SERVICE);
        if ((telecomManager != null && getPackageName().equals(telecomManager.getDefaultDialerPackage())) || i2 != 0) {
            return;
        }*/
//        if (i == 123 && i2 == RESULT_OK) {
//            // App is set as the default dialer
//            // You can now apply the selected item as the default calling theme
//            applyDefaultCallingTheme();
//        } else if (requestCode == 123 && resultCode == RESULT_CANCELED) {
//            // App is not set as the default dialer
//            // Show a dialog or take appropriate action
//            showDefaultSettingDialog();
//        }
        if (i == 123) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    intent2 = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
                } else {
                    intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
                }
                startActivityForResult(intent2, 12);
            } catch (ActivityNotFoundException unused) {
                new DialogSetting(this).show();
            }
        } else if (i == 12) {
            new DialogSetting(this).show();
        }
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




    private void initBtn() {

        binding.btnTrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Trending");
                    startActivity(intent);
                });


            }
        });
        binding.btnNeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Neon");
                    startActivity(intent);
                });

            }
        });
        binding.btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Love");
                    startActivity(intent);
                });

            }
        });
        binding.btnCute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Cute");
                    startActivity(intent);
                });

            }
        });
        binding.btnKpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Kpop");
                    startActivity(intent);
                });

            }
        });
        binding.btnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdUtils.showInterstitialAd(Constants.adsResponseModel.getInterstitial_ads().getAdx(), activity, isLoaded -> {
                    Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                    intent.putExtra("category", "Animal");
                    startActivity(intent);
                });

            }
        });

    }
}