package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MYpage3 extends AppCompatActivity {
    private Button btn_mm3;
    private Button btn_yy3;
    private int moon;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_m_ypage3);

        btn_mm3=findViewById(R.id.btn_mm3);
        btn_yy3 =findViewById(R.id.btn_yy3);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_mm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(MYpage3.this, MYpage4.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_yy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(MYpage3.this, MYpage4.class);
                intent.putExtra("moon", moon);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}