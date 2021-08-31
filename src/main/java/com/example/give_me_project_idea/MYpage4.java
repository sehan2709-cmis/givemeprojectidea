package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYpage4 extends AppCompatActivity {
    private Button btn_mm4;
    private Button btn_yy4;
    private int moon;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_ypage4);

        btn_mm4 =findViewById(R.id.btn_mm4);
        btn_yy4 =findViewById(R.id.btn_yy4);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_mm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(MYpage4.this, MYpage5.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_yy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(MYpage4.this, MYpage5.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}