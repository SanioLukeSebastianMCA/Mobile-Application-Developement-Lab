package com.example.labcycleadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<DataModel> persons_list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        persons_list.add(new DataModel("Shamjad","Front-End Developer"));
        persons_list.add(new DataModel("Vijay","Data Analyst"));
        persons_list.add(new DataModel("Vishnu Mohan","Software Tester"));
        persons_list.add(new DataModel("Vishnu Sadasivan","Software Developer"));
        persons_list.add(new DataModel("Stebin","Programming Analyst"));
        persons_list.add(new DataModel("Nikhil","Web Developer"));
        persons_list.add(new DataModel("Sanio","Mobile App Developer"));
        persons_list.add(new DataModel("Yedhu","Business Analyst"));
        persons_list.add(new DataModel("Vineeth","Database Analyst"));

        recyclerview= findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter customAdapter= new CustomAdapter(getApplicationContext(),persons_list);
        recyclerview.setAdapter(customAdapter);
    }
}