package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYpage5 extends AppCompatActivity {
    private Button btn_mm5;
    private Button btn_yy5;
    private int moon;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_ypage5);

        btn_mm5 =findViewById(R.id.btn_mm5);
        btn_yy5 =findViewById(R.id.btn_yy5);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_mm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(MYpage5.this, MYpage6.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_yy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(MYpage5.this, MYpage6.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}