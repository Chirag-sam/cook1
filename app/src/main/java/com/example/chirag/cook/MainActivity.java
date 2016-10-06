package com.example.chirag.cook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView)findViewById(R.id.tx);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/sweetlollipop.ttf");
        tx.setTypeface(custom_font);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent myIntent = new Intent(MainActivity.this, Activity_2.class);
                startActivity(myIntent);
                finish();
            }
        },5000);
    }
}
