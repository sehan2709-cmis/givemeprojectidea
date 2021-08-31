package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEGIGE extends AppCompatActivity {
    private Button gige_again;
    private Button gige_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_e_g_i_g_e);
        gige_others = findViewById(R.id.gige_others);
        gige_again = findViewById(R.id.gige_again);

        gige_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEGIGE.this, MainActivity.class);
                startActivity(intent);
            }
        });

        gige_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEGIGE.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}