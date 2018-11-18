package com.example.nasim.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionMenuIntegrate extends AppCompatActivity {
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_integrate);
        relativeLayout = findViewById(R.id.relative);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.messi)
    {
        relativeLayout.setBackgroundResource(R.drawable.lm10);
    }
        if(id == R.id.ronaldo)
    {
        relativeLayout.setBackgroundResource(R.drawable.cr7);
    }
        if(id == R.id.modric)
    {
        relativeLayout.setBackgroundResource(R.drawable.modric);
    }
        if (id == R.id.logout)
    {
        Toast.makeText(this, "Logging Out...", Toast.LENGTH_SHORT).show();
    }
        return super.onOptionsItemSelected(item);
}
}
