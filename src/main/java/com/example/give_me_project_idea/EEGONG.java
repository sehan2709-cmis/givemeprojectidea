package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEGONG extends AppCompatActivity {
    private Button gong_again;
    private Button gong_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_e_g_o_n_g);
        gong_others = findViewById(R.id.gong_others);
        gong_again = findViewById(R.id.gong_again);

        gong_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEGONG.this, MainActivity.class);
                startActivity(intent);
            }
        });

        gong_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEGONG.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}