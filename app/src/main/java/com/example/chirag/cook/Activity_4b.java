package com.example.chirag.cook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_4b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_4b);
        final EditText address = (EditText)findViewById(R.id.address);
        final EditText address2 = (EditText)findViewById(R.id.address2);
        final EditText address3 = (EditText)findViewById(R.id.address3);
        final EditText pincode = (EditText)findViewById(R.id.pincode);
        Button proceed = (Button)findViewById(R.id.proceed);

        address.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = address.getText().toString();
                if(s1.equals("Address line 1"))
                    address.setText(" ");
                return false;
            }

        });

        address.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = address.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    address.setText("Address line 1");

                }
            }
        });




        address2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = address2.getText().toString();
                if(s1.equals("Address line 2"))
                    address2.setText(" ");
                return false;
            }

        });

        address2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = address2.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    address2.setText("Address line 2");

                }
            }
        });





        address3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = address3.getText().toString();
                if(s1.equals("Address line 3"))
                    address3.setText(" ");
                return false;
            }

        });

        address3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = address3.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    address3.setText("Address line 3");

                }
            }
        });





        pincode.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String s1 = pincode.getText().toString();
                if(s1.equals("Pin Code"))
                    address.setText(" ");
                return false;
            }

        });

        pincode.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String s = pincode.getText().toString();
                if (!hasFocus && s.equals("  ")){
                    pincode.setText("Pin Code");
                }
            }
        });
    }
}
