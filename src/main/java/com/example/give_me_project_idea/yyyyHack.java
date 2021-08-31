package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyyHack extends AppCompatActivity {
    private Button back_yyyy;
    private Button yyyytoall;
    private Button gocheckyycd;
    private Button gocheckyyck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy_hack);

        back_yyyy = findViewById(R.id.back_yyyy);
        yyyytoall = findViewById(R.id.yyyytoall);
        gocheckyycd = findViewById(R.id.gocheckyycd);
        gocheckyyck = findViewById(R.id.gocheckyyck);
        back_yyyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yyyyHack.this, result3.class);
                startActivity(intent);
            }
        });

        yyyytoall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yyyyHack.this, AllHak.class);
                startActivity(intent);
            }
        });

        gocheckyycd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yyyyHack.this, PageYYCD.class);
                startActivity(intent);

            }
        });

        gocheckyyck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yyyyHack.this, PageYYCK.class);
                startActivity(intent);

            }
        });
    }
}