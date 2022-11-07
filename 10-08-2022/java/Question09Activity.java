package com.example.labcycles_sanioluke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

public class Question09Activity extends AppCompatActivity {

    ToggleButton toggle_img_btn;
    FrameLayout ques_09_mainlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question09);

        toggle_img_btn= findViewById(R.id.toggle_img_btn);
        ques_09_mainlay= findViewById(R.id.ques_09_mainlay);

        toggle_img_btn.setOnClickListener(v->{
            if(toggle_img_btn.isChecked()){
                toggle_img_btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_locked));
                Snackbar.make(ques_09_mainlay,"Application Locked Successfully.", Snackbar.LENGTH_SHORT).show();
            }
            else{
                toggle_img_btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_unlocked));
                Snackbar.make(ques_09_mainlay,"Application Unlocked Successfully.", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}