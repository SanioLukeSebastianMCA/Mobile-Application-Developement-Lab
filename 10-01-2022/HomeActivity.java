package com.example.labcycle03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {

    ImageButton home_homebtn, home_profilebtn, home_settingsbtn;
    View homemain_lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home_homebtn= findViewById(R.id.home_homebtn);
        home_profilebtn= findViewById(R.id.home_profilebtn);
        home_settingsbtn= findViewById(R.id.home_settingsbtn);
        homemain_lay= findViewById(R.id.homemain_lay);

        home_profilebtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
        home_settingsbtn.setOnClickListener(v-> {
            startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
   }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu_id= item.getItemId();
        /*switch (menu_id){
            case R.id.homemenu_search:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_add:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_edit:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_display:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_delete:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_upload:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }

            case R.id.homemenu_login:{
                Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
                break;
            }
        }*/
        Snackbar.make(homemain_lay,item.getTitle()+" Clicked....",Snackbar.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}