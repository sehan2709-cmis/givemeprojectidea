package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MMGGMN extends AppCompatActivity {
    private Button ggmn_again;
    private Button ggmn_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_m_g_g_m_n);
        ggmn_others = findViewById(R.id.ggmn_others);
        ggmn_again = findViewById(R.id.ggmn_again);

        ggmn_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMGGMN.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ggmn_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMGGMN.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}