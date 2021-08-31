package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYpage7 extends AppCompatActivity {
    private Button btn_mm7;
    private Button btn_yy7;
    private int moon;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_ypage7);

        btn_mm7 =findViewById(R.id.btn_mm7);
        btn_yy7 =findViewById(R.id.btn_yy7);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_mm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                if(moon > yyyy) {
                    Intent intent = new Intent(MYpage7.this, result2.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(MYpage7.this, result3.class);
                    startActivity(intent);
                }
            }
        });

        btn_yy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                if(moon > yyyy) {
                    Intent intent = new Intent(MYpage7.this, result2.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(MYpage7.this, result3.class);
                    startActivity(intent);
                }
            }
        });
    }
}