package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Yunghap extends AppCompatActivity {
    private Button yutoall;
    private Button gocheckyuce;
    private Button gocheckyuai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yunghap);
        yutoall = findViewById(R.id.yutoall);
        gocheckyuce = findViewById(R.id.gocheckyuce);
        gocheckyuai = findViewById(R.id.gocheckyuai);

        yutoall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Yunghap.this, AllHak.class);
                startActivity(intent);
            }
        });

        gocheckyuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Yunghap.this, YungCE.class);
                startActivity(intent);
            }
        });

        gocheckyuai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Yunghap.this, YungAI.class);
                startActivity(intent);
            }
        });
    }
}