package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
EditText e1,e2,e3;
    Button b1,b2;
    String s1,s2,s3,s4;
    int a1,a2,c1,d1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        e1 = (EditText) findViewById(R.id.no1);
        e2 = (EditText) findViewById(R.id.no2);
        e3 = (EditText) findViewById(R.id.no3);
        b1 = (Button) findViewById(R.id.xc);
        b2 = (Button) findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                s3 = e3.getText().toString();
                a1 = Integer.parseInt(s1);
                a2 = Integer.parseInt(s2);
                c1 = Integer.parseInt(s3);
                d1 = a1 + a2 + c1;
                s4 = String.valueOf(d1);
                Toast.makeText(getApplicationContext(), s4, Toast.LENGTH_LONG).show();
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(), CalcActivity.class);
                startActivity(q);

            }
        });

    }
    }
