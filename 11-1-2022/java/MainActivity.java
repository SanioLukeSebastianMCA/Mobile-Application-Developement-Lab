package com.example.labcycleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] person_names= {"Shamjad","Vijay","Vishnu Mohan","Vishnu Sadasivan","Stebin","Nikhil","Sanio","Yedhu","Vineeth"};
    String[] person_qualify= {"Front-End Developer","Data Analyst","Software Tester","Software Developer","Programming Analyst","Web Developer","Mobile App Developer","Business Analyst","Database Analyst"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview= findViewById(R.id.listview);
        listview.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,person_names));

        listview.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "The qualification of "+person_names[position]+" is : "+person_qualify[position], Toast.LENGTH_SHORT).show();
        });
    }
}