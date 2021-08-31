package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MMBUBU extends AppCompatActivity {
    private Button bubu_again;
    private Button bubu_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_m_b_u_b_u);
        bubu_others = findViewById(R.id.bubu_others);
        bubu_again = findViewById(R.id.bubu_again);

        bubu_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMBUBU.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bubu_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MMBUBU.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}