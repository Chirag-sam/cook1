package com.example.chirag.cook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_2);
        ImageButton become = (ImageButton)findViewById(R.id.become);
        ImageButton get = (ImageButton)findViewById(R.id.get);
        become.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_2.this, Activity_3b.class);
                startActivity(myIntent);
            }
        });
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_2.this, Activity_3g.class);
                startActivity(myIntent);
            }
        });
    }
}
