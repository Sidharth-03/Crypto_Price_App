package com.example.madproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class coverpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverpage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome= new Intent(coverpage.this, firebase.class);
                startActivity(iHome);
            }
        }, 2000);
    }
}