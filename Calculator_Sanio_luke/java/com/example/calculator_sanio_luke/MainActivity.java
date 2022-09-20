package com.example.calculator_sanio_luke;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout num1_input, num2_input;
    TextView res_txt;
    Button add_btn, sub_btn, mul_btn, div_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1_input= findViewById(R.id.num1_input);
        num2_input= findViewById(R.id.num2_input);
        res_txt= findViewById(R.id.res_txt);
        add_btn= findViewById(R.id.add_btn);
        sub_btn= findViewById(R.id.sub_btn);
        mul_btn= findViewById(R.id.mul_btn);
        div_btn= findViewById(R.id.div_btn);

        add_btn.setOnClickListener(v-> calculation(num1_input, num2_input, "added"));

        sub_btn.setOnClickListener(v-> calculation(num1_input, num2_input, "substracted"));

        mul_btn.setOnClickListener(v-> calculation(num1_input, num2_input, "multiplied") );

        div_btn.setOnClickListener(v-> calculation(num1_input, num2_input, "divided") );
    }

    void calculation(@NonNull TextInputLayout num1_input, @NonNull TextInputLayout num2_input, String op){

        String n1= num1_input.getEditText().getText().toString().replaceAll(" ","");
        String n2= num2_input.getEditText().getText().toString().replaceAll(" ","");

        if(n1.equals("")){
            num1_input.setError("Please enter a number !!");
            num1_input.findFocus();
        }
        else if(n2.equals("")){
            num2_input.setError("Please enter a number !!");
            num2_input.findFocus();
        }
        else{
            num1_input.clearFocus();
            num2_input.clearFocus();
            num1_input.setErrorEnabled(false);
            num2_input.setErrorEnabled(false);

            int num1= Integer.parseInt(n1);
            int num2= Integer.parseInt(n2);

            int res= (op.equals("added")) ? (num1+num2) : (op.equals("substracted") ? (num1-num2) : (op.equals("multiplied") ? (num1*num2) : (op.equals("divided") ? (num1/num2) : (0))));
            res_txt.setText("The Result Value is :"+res);
            Toast.makeText(getApplicationContext(), "The "+op+" value is : "+res, Toast.LENGTH_SHORT).show();
        }
    }
}