package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText text1,text2;
    Button ok;
    Toast toast;
    String num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ok = findViewById(R.id.okbtn);
        text1 = findViewById(R.id.editTextNumber1);
        text2 = findViewById(R.id.editTextNumber2);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);

                 //take the numbers
                 num1 = text1.getText().toString();
                 i.putExtra("EXTRA1" ,num1);
                 startActivity(i);

                 num2 = text2.getText().toString();
                 i.putExtra("EXTRA2" ,num2);
                 startActivity(i);

                LayoutInflater li = getLayoutInflater();

                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                //toast
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

            }
        });

    }
}



