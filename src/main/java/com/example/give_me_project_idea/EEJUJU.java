package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEJUJU extends AppCompatActivity {
    private Button juju_again;
    private Button juju_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_e_j_u_j_u);
        juju_others = findViewById(R.id.juju_others);
        juju_again = findViewById(R.id.juju_again);

        juju_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEJUJU.this, MainActivity.class);
                startActivity(intent);
            }
        });

        juju_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEJUJU.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}