package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllHak extends AppCompatActivity {
    private Button all_to_mmmm;
    private Button all_to_eeee;
    private Button all_to_yyyy;
    private Button all_again;
    private Button all_to_yung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_all_hak);
        all_to_mmmm = findViewById(R.id.all_to_mmmm);
        all_to_eeee = findViewById(R.id.all_to_eeee);
        all_to_yyyy = findViewById(R.id.all_to_yyyy);
        all_again = findViewById(R.id.all_again);
        all_to_yung = findViewById(R.id.all_to_yung);

        all_to_yung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllHak.this, Yunghap.class);
                startActivity(intent);
            }
        });

        all_to_mmmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllHak.this, moonHack.class);
                startActivity(intent);
            }
        });

        all_to_eeee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllHak.this, eeeeHack.class);
                startActivity(intent);
            }
        });

        all_to_yyyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllHak.this, yyyyHack.class);
                startActivity(intent);
            }
        });

        all_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AllHak.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}