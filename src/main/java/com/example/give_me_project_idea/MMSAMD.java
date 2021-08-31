package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MMSAMD extends AppCompatActivity {
    private Button samd_again;
    private Button samd_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_m_s_a_m_d);
        samd_others = findViewById(R.id.samd_others);
        samd_again = findViewById(R.id.samd_again);

        samd_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMSAMD.this, MainActivity.class);
                startActivity(intent);
            }
        });

        samd_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMSAMD.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}