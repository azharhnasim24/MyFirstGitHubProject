package com.example.nasim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentOnePageToAnother extends AppCompatActivity {
    Button button;
    EditText text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another);

        button = findViewById(R.id.button);
        text1 = (EditText)findViewById(R.id.editText1);
        text2 = (EditText)findViewById(R.id.editText2);
        text3 = (EditText)findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = text1.getText().toString();
                String s2 = text2.getText().toString();
                String s3 = text3.getText().toString();

                Intent intent = new Intent(IntentOnePageToAnother.this,MainActivity02.class);
                intent.putExtra("value1",s1);
                intent.putExtra("value2",s2);
                intent.putExtra("value3",s3);
                startActivity(intent);
            }
        });
    }
}
