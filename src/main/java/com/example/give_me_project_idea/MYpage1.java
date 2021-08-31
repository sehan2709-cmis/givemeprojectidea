package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYpage1 extends AppCompatActivity {

    private Button btn_mm1;
    private Button btn_yy1;

    private int moon;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_ypage1);

        btn_mm1 =findViewById(R.id.btn_mm1);
        btn_yy1 =findViewById(R.id.btn_yy1);

        moon = 1;
        yyyy = 1;
        btn_mm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(MYpage1.this, MYpage2.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_yy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(MYpage1.this, MYpage2.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}