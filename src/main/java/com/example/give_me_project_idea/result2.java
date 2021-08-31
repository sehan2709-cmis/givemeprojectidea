package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result2 extends AppCompatActivity {
    private Button btn_con2;
    private Button to_moon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_result2);
        btn_con2 = findViewById(R.id.btn_con2);
        to_moon = findViewById(R.id.to_moon);

        btn_con2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result2.this, mmmm1.class);
                startActivity(intent);
            }
        });

        to_moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result2.this, moonHack.class);
                startActivity(intent);
            }
        });
    }
}