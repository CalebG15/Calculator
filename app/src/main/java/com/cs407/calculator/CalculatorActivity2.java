package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity2 extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity2);

        result=(TextView) findViewById(R.id.result);
        Intent intent=getIntent();
        String str=intent.getStringExtra("result");
        result.setText(str);
    }
}