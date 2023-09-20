package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
    }

    public void button_operation(View view) {
        int operation = view.getId();
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secNum = (EditText) findViewById(R.id.secNum);

        int num1;
        if (firstNum.getText().toString().equals("")) {
            num1 = 0;
        } else {
            num1 = Integer.parseInt(firstNum.getText().toString());
        }

        int num2;
        if (secNum.getText().toString().equals("")) {
           num2 = 0;
        } else {
            num2 = Integer.parseInt(secNum.getText().toString());
        }

        String ans;
        switch (operation) {
            case 2131230819:
                // add
                ans = Integer.toString(num1 + num2);
                break;
            case 2131230822:
                // sub
                ans = Integer.toString(num1 - num2);
                break;
            case 2131230821:
                // mult
                ans = Integer.toString(num1 * num2);
                break;
            case 2131230820:
                //divide
                if (num2 != 0) {
                ans = Integer.toString(num1 / num2);
                } else {
                    ans = "Error: Divide by 0";
                }
                break;
            default:
                ans = "0";
        }

        goToActivity(ans);
    }

    public void goToActivity(String s) {
        Intent intent=new Intent(this, CalculatorActivity2.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
}