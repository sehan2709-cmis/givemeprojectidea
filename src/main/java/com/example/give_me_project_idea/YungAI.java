package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YungAI extends AppCompatActivity {
    private Button yuai_again;
    private Button yuai_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yung_a_i);

        yuai_others = findViewById(R.id.yuai_others);
        yuai_again = findViewById(R.id.yuai_again);

        yuai_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YungAI.this, AllHak.class);
                startActivity(intent);
            }
        });

        yuai_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YungAI.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}