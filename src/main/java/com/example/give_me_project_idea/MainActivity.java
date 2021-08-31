package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    private Button btn_me;
    private Button btn_startee;
    private Button btn_startmm;
    private Button btn_startyy;
    private Button starttoAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btn_start =findViewById(R.id.btn_start);
        btn_me = findViewById(R.id.btn_me);
        btn_startyy = findViewById(R.id.btn_startyy);
        btn_startee = findViewById(R.id.btn_startee);
        btn_startmm = findViewById(R.id.btn_startmm);
        starttoAll = findViewById(R.id.starttoAll);

        starttoAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllHak.class);
                startActivity(intent);
            }
        });

        btn_startyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, result3.class);
                startActivity(intent);
            }
        });

        btn_startee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, result4.class);
                startActivity(intent);
            }
        });

        btn_startmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, result2.class);
                startActivity(intent);
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pageOne.class);
                startActivity(intent);
            }
        });

        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Credits.class);
                startActivity(intent);
            }
        });
    }
}