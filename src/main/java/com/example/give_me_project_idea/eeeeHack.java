package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeeeHack extends AppCompatActivity {
    private Button back_eeee;
    private Button eeeetoall;
    private Button checkgige;
    private Button checkgong;
    private Button checkjuju;
    private Button checkictt;
    private Button checkbioo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee_hack);

        back_eeee = findViewById(R.id.back_eeee);
        eeeetoall = findViewById(R.id.eeeetoall);
        checkgige = findViewById(R.id.checkgige);
        checkgong = findViewById(R.id.checkgong);
        checkjuju = findViewById(R.id.checkjuju);
        checkictt = findViewById(R.id.checkictt);
        checkbioo = findViewById(R.id.checkbioo);

        checkgige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, EEGIGE.class);
                startActivity(intent);
            }
        });

        checkgong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, EEGONG.class);
                startActivity(intent);
            }
        });

        checkjuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, EEJUJU.class);
                startActivity(intent);
            }
        });

        checkictt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, EEICTT.class);
                startActivity(intent);
            }
        });

        checkbioo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, EEBIOO.class);
                startActivity(intent);
            }
        });
        back_eeee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, result4.class);
                startActivity(intent);
            }
        });
        eeeetoall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eeeeHack.this, AllHak.class);
                startActivity(intent);
            }
        });

    }
}