package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class moonHack extends AppCompatActivity {
    private Button back_moon;
    private Button mmmmtoall;
    private Button gocheckmmggmn;
    private Button gocheckmmgege;
    private Button gocheckmmbubu;
    private Button gocheckmmsamd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_moon_hack);

        back_moon = findViewById(R.id.back_moon);
        mmmmtoall = findViewById(R.id.mmmmtoall);
        gocheckmmggmn= findViewById(R.id.gocheckmmggmn);
        gocheckmmgege= findViewById(R.id.gocheckmmgege);
        gocheckmmbubu= findViewById(R.id.gocheckmmbubu);
        gocheckmmsamd= findViewById(R.id.gocheckmmsamd);

        gocheckmmggmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moonHack.this, MMGGMN.class);
                startActivity(intent);
            }
        });

        gocheckmmgege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moonHack.this, MMGEGE.class);
                startActivity(intent);
            }
        });

        gocheckmmbubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moonHack.this, MMBUBU.class);
                startActivity(intent);
            }
        });

        gocheckmmsamd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moonHack.this, MMSAMD.class);
                startActivity(intent);
            }
        });

        back_moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moonHack.this, result2.class);
                startActivity(intent);
            }
        });

        mmmmtoall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(moonHack.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}