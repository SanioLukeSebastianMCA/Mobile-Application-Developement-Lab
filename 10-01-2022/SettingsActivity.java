package com.example.labcycle03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SettingsActivity extends AppCompatActivity {

    ImageButton settings_homebtn, settings_profilebtn, settings_settingsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settings_homebtn= findViewById(R.id.settings_homebtn);
        settings_profilebtn= findViewById(R.id.settings_profilebtn);
        settings_settingsbtn= findViewById(R.id.settings_settingsbtn);

        settings_homebtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
        settings_profilebtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });

    }
}