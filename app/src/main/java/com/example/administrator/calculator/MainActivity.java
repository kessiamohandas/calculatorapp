package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
String s1,s2,s3;
    int x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.sub1);
        e2=(EditText)findViewById(R.id.sub2);
        b1=(Button)findViewById(R.id.subtract);
        b2=(Button)findViewById(R.id.back2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s1=e1.getText().toString();
                s2=e2.getText().toString();
                x=Integer.parseInt(s1);
                y=Integer.parseInt(s2);
                z=x-y;
                s3=String.valueOf(z);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),CalcActivity.class);
                startActivity(e);
            }
        });
    }
}
