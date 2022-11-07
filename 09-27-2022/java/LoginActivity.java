package com.example.labcycle02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout username, password;
    private Button login_btn, reg_btn;
    LinearLayout login_mainlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        login_btn= findViewById(R.id.login_btn);
        reg_btn= findViewById(R.id.reg_btn);
        login_mainlay= findViewById(R.id.login_mainlay);

        login_btn.setOnClickListener(v-> processCredentials(1));
        reg_btn.setOnClickListener(v-> processCredentials(0));
    }

    private void processCredentials(int check) {

        String username_txt= username.getEditText().getText().toString();
        String password_txt= password.getEditText().getText().toString();

        SharedPreferences pref= getSharedPreferences("login_details",MODE_PRIVATE);
        SharedPreferences.Editor pref_edit= pref.edit();

        if(username_txt.length() <= 0){
            username.setError("Please enter a username !!");
            username.requestFocus();
        }
        else if(username_txt.length() <= 3){
            username.setError("username too short !! Should be more than 3 characters !!");
            username.requestFocus();
        }
        else if(password_txt.length() <= 0){
            username.setError(null);
            password.setError("Please enter a password !!");
            password.requestFocus();
        }
        else if(password_txt.length() <= 4){
            username.setError(null);
            password.setError("username too short !! Should be more than 4 characters !!");
            password.requestFocus();
        }
        else{
            username.setError(null);
            password.setError(null);
            if(check==0){
                pref_edit.putString("log_uname",username_txt);
                pref_edit.putString("log_upass",password_txt);
                pref_edit.apply();
                Snackbar.make(login_mainlay,"Registeration Successful. Please Login Now.", Snackbar.LENGTH_SHORT).show();
            }
            else{
                String uname= pref.getString("log_uname",null);
                String upass= pref.getString("log_upass",null);
                if(uname==null || upass==null){
                    Snackbar.make(login_mainlay,"Unable the login. Please register before logining !!", Snackbar.LENGTH_SHORT).show();
                }
                else{
                    if(username_txt.equals(uname) && password_txt.equals(upass)){
                        Snackbar.make(login_mainlay, "Login Successful..", Snackbar.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), VisitCardActivity.class));
                    }
                    else{
                        Snackbar.make(login_mainlay, "Login failed !! Invalid username or password !!", Snackbar.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }
}