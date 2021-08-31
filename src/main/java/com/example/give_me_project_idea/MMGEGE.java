package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MMGEGE extends AppCompatActivity {
    private Button gege_again;
    private Button gege_others;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_m_g_e_g_e);
        gege_others = findViewById(R.id.gege_others);
        gege_again = findViewById(R.id.gege_again);

        gege_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMGEGE.this, MainActivity.class);
                startActivity(intent);
            }
        });

        gege_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMGEGE.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}