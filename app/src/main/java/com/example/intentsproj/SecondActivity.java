package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String num1, num2;
    EditText text1, text2;
    Button add, subs, multi, divi;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        add = findViewById(R.id.addbtn);
        subs = findViewById(R.id.subbtn);
        multi = findViewById(R.id.multibtn);
        divi = findViewById(R.id.divibtn);
        text1 = findViewById(R.id.editTextNumber3);
        text2 = findViewById(R.id.editTextNumber4);
        answer = findViewById(R.id.answer);

        num1 = intent.getStringExtra("EXTRA1");
        num2 = intent.getStringExtra("EXTRA2");

        text1.setText(num1);
        text2.setText(num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ans;
                ans = Integer.parseInt(num1) + Integer.parseInt(num2);
                answer.setText(num1 + "+" + num2 + "=" + ans);
            }
        });

        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans;
                ans = Float.parseFloat(num1) - Float.parseFloat(num2);
                answer.setText(num1 + "-" + num2 + "=" + ans);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans;
                ans = Float.parseFloat(num1) * Float.parseFloat(num2);
                answer.setText(num1 + "*" + num2 + "=" + ans);
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans;
                ans = Float.parseFloat(num1) / Float.parseFloat(num2);
                answer.setText(num1 + "/" + num2 + "=" + ans);

            }
        });
    }
}