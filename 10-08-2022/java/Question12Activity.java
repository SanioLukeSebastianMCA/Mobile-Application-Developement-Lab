package com.example.labcycles_sanioluke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Question12Activity extends AppCompatActivity {

    CheckBox ques_12_check1, ques_12_check2, ques_12_check3, ques_12_check4, ques_12_check5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question12);

        ques_12_check1= findViewById(R.id.ques_12_check1);
        ques_12_check2= findViewById(R.id.ques_12_check2);
        ques_12_check3= findViewById(R.id.ques_12_check3);
        ques_12_check4= findViewById(R.id.ques_12_check4);
        ques_12_check5= findViewById(R.id.ques_12_check5);

        ArrayList<String> arr_fruits= new ArrayList<>();
        if(ques_12_check1.isSelected()){

        }
    }
}