package com.example.chirag.cook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_3b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_3b);
        final EditText name = (EditText)findViewById(R.id.name);
        final EditText email = (EditText)findViewById(R.id.email);
        final EditText phone = (EditText)findViewById(R.id.phone);
        Button proceed = (Button)findViewById(R.id.proceed);
        name.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = name.getText().toString();
                if(s1.equals("Name"))
                    name.setText(" ");
                return false;
            }

        });

        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = name.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    name.setText("Name");

                }


            }
        });

        email.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = email.getText().toString();
                if(s1.equals("E-mail"))
                    email.setText(" ");
                return false;
            }

        });

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = email.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    email.setText("E-mail");

                }


            }
        });
        phone.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = phone.getText().toString();
                if(s1.equals("Phone"))
                    phone.setText(" ");
                return false;
            }

        });


        phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = phone.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    phone.setText("Phone");

                }


            }
        });
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Activity_3b.this, Activity_4b.class);
                startActivity(myIntent);
            }
        });
    }
}
