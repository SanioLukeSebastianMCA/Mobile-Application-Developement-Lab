package com.example.labcycles_sanioluke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Question01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question01);

        EditText username_txt= findViewById(R.id.username_txt);
        EditText password_txt= findViewById(R.id.password_txt);
        Button login_btn= findViewById(R.id.login_btn);

        login_btn.setOnClickListener(v->{
            String username= username_txt.getText().toString();
            String password= password_txt.getText().toString();
            Toast.makeText(getApplicationContext(), "Login Successful.\nUsername - "+username+"\nPassword - "+password, Toast.LENGTH_SHORT).show();
        });
    }
}