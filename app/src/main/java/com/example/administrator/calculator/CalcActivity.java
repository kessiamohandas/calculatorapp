package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalcActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        b1=(Button)findViewById(R.id.add1);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.mul);
        b4=(Button)findViewById(R.id.div);
        b5=(Button)findViewById(R.id.lar);
        b6=(Button)findViewById(R.id.small);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new  Intent(getApplicationContext(),AddActivity.class);
                startActivity(a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent e=new Intent(getApplicationContext(),MainActivity.class) ;
                startActivity(e);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(),MulActivity.class);
                startActivity(m);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(getApplicationContext(),DivActivity.class);
                startActivity(n);
            }
        });
    }

}
