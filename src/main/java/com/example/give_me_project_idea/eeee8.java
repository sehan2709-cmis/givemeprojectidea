package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee8 extends AppCompatActivity {
    private Button btn_eeq8;
    private Button btn_egq8;

    private int gige;
    private int gong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee8);

        btn_eeq8 =findViewById(R.id.btn_eeq8);
        btn_egq8 =findViewById(R.id.btn_egq8);

        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        btn_eeq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 5;
                if(gige > gong) {
                    Intent intent = new Intent(eeee8.this, EEGIGE.class);
                    startActivity(intent);
                } else if(gige <= gong) {
                    Intent intent = new Intent(eeee8.this, EEGONG.class);
                    startActivity(intent);
                }
            }
        });

        btn_egq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 5;
                gong += 2;
                if(gige > gong) {
                    Intent intent = new Intent(eeee8.this, EEGIGE.class);
                    startActivity(intent);
                } else if(gige <= gong) {
                    Intent intent = new Intent(eeee8.this, EEGONG.class);
                    startActivity(intent);
                }
            }
        });
    }
}