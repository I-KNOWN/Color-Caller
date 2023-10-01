package com.uprisingscallscreen.theme.flashscreen.ui;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.uprisingscallscreen.theme.flashscreen.MainActivity;
import com.uprisingscallscreen.theme.flashscreen.R;

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
                startActivity(new Intent(PrivacyPolicyActivity.this, MainActivity.class));
            }
        });
    }

}