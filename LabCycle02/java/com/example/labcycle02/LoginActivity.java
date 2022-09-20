package com.example.labcycle02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout username, password;
    private Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        login_btn= findViewById(R.id.login_btn);

        login_btn.setOnClickListener(v->{
            String username_txt= username.getEditText().getText().toString();
            String password_txt= password.getEditText().getText().toString();

            if(username_txt.length() <= 0){
                username.setError("Please enter a username !!");
                username.requestFocus();
            }
            else if(password_txt.length() <= 0){
                username.setError(null);
                password.setError("Please enter a password !!");
                password.requestFocus();
            }
            else{
                username.setError(null);
                password.setError(null);
                Toast.makeText(this, "Login Successful.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}