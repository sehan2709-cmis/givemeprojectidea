package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YungCE extends AppCompatActivity {
    private Button yuce_again;
    private Button yuce_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yung_c_e);
        yuce_again = findViewById(R.id.yuce_again);
        yuce_others = findViewById(R.id.yuce_others);

        yuce_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YungCE.this, MainActivity.class);
                startActivity(intent);
            }
        });

        yuce_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YungCE.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}