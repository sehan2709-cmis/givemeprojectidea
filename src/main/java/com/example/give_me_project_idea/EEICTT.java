package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEICTT extends AppCompatActivity {
    private Button ictt_again;
    private Button ictt_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_e_i_c_t_t);
        ictt_others = findViewById(R.id.ictt_others);
        ictt_again = findViewById(R.id.ictt_again);

        ictt_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEICTT.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ictt_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEICTT.this, AllHak.class);
                startActivity(intent);
            }
        });

    }
}