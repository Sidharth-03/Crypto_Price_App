package com.example.madproject2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class firebase extends AppCompatActivity {

    FirebaseAuth mAuth;
    Button bt1;
    TextView tv1;
    FirebaseUser user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        mAuth = FirebaseAuth.getInstance();
        tv1 = findViewById(R.id.tv1);
        bt1 = findViewById(R.id.bt1);
        user = mAuth.getCurrentUser();
        if(user == null){  // USER DOES NOT EXISTS
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }

        else{
            tv1.setText(user.getEmail());
        }

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
