package com.example.labcycle02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class CalculatorActivity extends AppCompatActivity {

    private LinearLayout calculator_mainlay;
    private TextInputLayout num1, num2, result;
    private Button numclearall_btn, numclear_btn, decimal_btn, numplusminus_btn;
    private Button divide_btn, multiply_btn, substract_btn, add_btn, nummodulus_btn, equals_btn;
    private Button num1_btn, num2_btn, num3_btn, num4_btn, num5_btn, num6_btn, num7_btn, num8_btn, num9_btn, num0_btn;
    private TextView operation_check_txt;
    private int opt= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        initViews();

        num1.getEditText().setShowSoftInputOnFocus(false);
        num2.getEditText().setShowSoftInputOnFocus(false);
        result.getEditText().setShowSoftInputOnFocus(false);

        num0_btn.setOnClickListener(v-> setTextEditText("0"));
        num1_btn.setOnClickListener(v-> setTextEditText("1"));
        num2_btn.setOnClickListener(v-> setTextEditText("2"));
        num3_btn.setOnClickListener(v-> setTextEditText("3"));
        num4_btn.setOnClickListener(v-> setTextEditText("4"));
        num5_btn.setOnClickListener(v-> setTextEditText("5"));
        num6_btn.setOnClickListener(v-> setTextEditText("6"));
        num7_btn.setOnClickListener(v-> setTextEditText("7"));
        num8_btn.setOnClickListener(v-> setTextEditText("8"));
        num9_btn.setOnClickListener(v-> setTextEditText("9"));

        numplusminus_btn.setOnClickListener(v->{
            SharedPreferences shared= getSharedPreferences("app_data", Context.MODE_PRIVATE);
            SharedPreferences.Editor pedit= shared.edit();
            String number= shared.getString("getNumber",null);
            if(number==null){
                Toast.makeText(getApplicationContext(), "The value is not set !!", Toast.LENGTH_SHORT).show();
            }
            pedit.putString("getNumber",num1.getEditText().getText().toString());
            pedit.apply();
            number= shared.getString("getNumber","0");
            Toast.makeText(getApplicationContext(), "The number is : "+number, Toast.LENGTH_SHORT).show();
        });

        decimal_btn.setOnClickListener(v->{
            SharedPreferences shared= getSharedPreferences("app_data", Context.MODE_PRIVATE);
            String number= shared.getString("getNumber","0");
            if(number==null){
                Toast.makeText(getApplicationContext(), "The value is not set !!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "The number is : "+number, Toast.LENGTH_SHORT).show();
            }
        });

        equals_btn.setOnClickListener(v->{

            String num1_txt= num1.getEditText().getText().toString();
            String num2_txt= num2.getEditText().getText().toString();

            if(num1_txt.length() <= 0){
                num1.requestFocus();
                num1.setError("Enter the number 01 !!");
            }

            float number_1= Integer.parseInt(num1_txt);
            float number_2= Integer.parseInt(num2_txt);
            if(opt==0){

            }
        });
    }

    private void setTextEditText(String s) {
        if(num1.getEditText().isFocused()){
            String num1_txt= num1.getEditText().getText().toString();
            num1_txt= num1_txt+s;
            num1.getEditText().setText(num1_txt);
        }
        else{
            String num2_txt= num2.getEditText().getText().toString();
            num2_txt= num2_txt+s;
            num2.getEditText().setText(num2_txt);
        }
    }

    private void initViews() {
        operation_check_txt= findViewById(R.id.operation_check_txt);
        calculator_mainlay= findViewById(R.id.calculator_mainlay);
        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        result= findViewById(R.id.result);
        numclearall_btn= findViewById(R.id.numclearall_btn);
        numclear_btn= findViewById(R.id.numclear_btn);
        decimal_btn= findViewById(R.id.decimal_btn);
        numplusminus_btn= findViewById(R.id.numplusminus_btn);
        divide_btn= findViewById(R.id.divide_btn);
        multiply_btn= findViewById(R.id.multiply_btn);
        substract_btn= findViewById(R.id.substract_btn);
        add_btn= findViewById(R.id.add_btn);
        nummodulus_btn= findViewById(R.id.nummodulus_btn);
        equals_btn= findViewById(R.id.equals_btn);
        num0_btn= findViewById(R.id.num0_btn);
        num1_btn= findViewById(R.id.num1_btn);
        num2_btn= findViewById(R.id.num2_btn);
        num3_btn= findViewById(R.id.num3_btn);
        num4_btn= findViewById(R.id.num4_btn);
        num5_btn= findViewById(R.id.num5_btn);
        num6_btn= findViewById(R.id.num6_btn);
        num7_btn= findViewById(R.id.num7_btn);
        num8_btn= findViewById(R.id.num8_btn);
        num9_btn= findViewById(R.id.num9_btn);
    }
}