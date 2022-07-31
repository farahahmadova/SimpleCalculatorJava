package com.farahahmadova.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView resulttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        resulttext=findViewById(R.id.resulttext);
    }
    public void sum(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resulttext.setText("Enter Number");
        }
        else {
            int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int result=num1+num2;
            resulttext.setText("Result:"+result);
        }
    }
    public void subtract(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resulttext.setText("Enter Number");
        }
        else {
            int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int result=num1-num2;
            resulttext.setText("Result:"+result);
        }
    }
    public void multiply(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resulttext.setText("Enter Number");
        }
        else {
            int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int result=num1*num2;
            resulttext.setText("Result:"+result);
        }
    }
    public void division(View view){
        if (number1.getText().toString().matches("")||number2.getText().toString().matches("")){
            resulttext.setText("Enter Number");
        }
        else {
            int num1=Integer.parseInt(number1.getText().toString());
            int num2=Integer.parseInt(number2.getText().toString());
            int result=num1/num2;
            resulttext.setText("Result:"+result);
        }
    }

}