package com.example.nasim.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BackPress extends AppCompatActivity {

    TextView text;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_press);

        text = findViewById(R.id.text);
        relativeLayout = findViewById(R.id.relative);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(BackPress.this,text);

                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();

                        if(id == R.id.yellow)
                        {
                            relativeLayout.setBackgroundColor(Color.YELLOW);
                        }
                        if(id == R.id.red)
                        {
                            text.setTextColor(Color.RED);
                            relativeLayout.setBackgroundColor(Color.WHITE);
                        }
                        if(id == R.id.blue)
                        {
                            text.setTextColor(Color.BLUE);
                            relativeLayout.setBackgroundColor(Color.WHITE);
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        //For inserting back arrow
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    //For coming back to home
    @Override
    public void onBackPressed() {
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_HOME);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);

        Intent intent= new Intent(BackPress.this,OptionMenuIntegrate.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         int id = item.getItemId();

         if (id == android.R.id.home)
         {
             onBackPressed();
         }
         return super.onOptionsItemSelected(item);
    }
}