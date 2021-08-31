package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEBIOO extends AppCompatActivity {
    private Button bioo_again;
    private Button bioo_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_e_b_i_o_o);
        bioo_others = findViewById(R.id.bioo_others);
        bioo_again = findViewById(R.id.bioo_again);

        bioo_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEBIOO.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bioo_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEBIOO.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}