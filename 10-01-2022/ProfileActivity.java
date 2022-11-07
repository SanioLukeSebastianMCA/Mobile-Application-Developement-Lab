package com.example.labcycle03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    ImageButton profile_homebtn, profile_profilebtn, profile_settingsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_homebtn= findViewById(R.id.profile_homebtn);
        profile_profilebtn= findViewById(R.id.profile_profilebtn);
        profile_settingsbtn= findViewById(R.id.profile_settingsbtn);

        profile_homebtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
        profile_settingsbtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
    }
}