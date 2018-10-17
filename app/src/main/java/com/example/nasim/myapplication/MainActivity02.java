package com.example.nasim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity02 extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        Intent intent = getIntent();
        String s1 = intent.getStringExtra("value1");
        String s2 = intent.getStringExtra("value2");
        String s3 = intent.getStringExtra("value3");
        tv4.setText(s1);
        tv5.setText(s2);
        tv6.setText(s3);
    }
}
