package com.example.labcycle02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class facebookLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);

        EditText fb_id = findViewById(R.id.fb_id);
        EditText fb_pass = findViewById(R.id.fb_pass);
        Button fb_loginbtn = findViewById(R.id.fb_loginbtn);
        LinearLayout mainlay= findViewById(R.id.mainlay);

        fb_loginbtn.setOnClickListener(v->{
            String fb_id_txt= fb_id.getText().toString();
            String fb_pass_txt= fb_pass.getText().toString();
            fb_pass.setError(null);

            if(fb_id_txt.length() <= 0){
                fb_id.setError("Please enter email id or phone !!");
                fb_id.requestFocus();
            }
            else if(fb_pass_txt.length() <= 0){
                fb_id.setError(null);
                fb_pass.setError("Please enter a passwor !!");
                fb_pass.requestFocus();
            }
            else {
                fb_id.setError(null);
                fb_pass.setError(null);
                Snackbar.make(mainlay, "Facebook Login Successfully",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}