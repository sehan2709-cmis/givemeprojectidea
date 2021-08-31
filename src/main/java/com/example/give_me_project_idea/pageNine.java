package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageNine extends AppCompatActivity {
    private Button btn_e9;
    private Button btn_m9;
    private int moon;
    private int eeee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_page_nine);

        btn_e9 = findViewById(R.id.btn_e9);
        btn_m9 = findViewById(R.id.btn_m9);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        eeee = getIntent.getIntExtra("eeee", 0);

        btn_e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(pageNine.this, result1.class);
                intent.putExtra("moon", moon);
                intent.putExtra("eeee", eeee);
                startActivity(intent);
            }
        });

        btn_m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(pageNine.this, result1.class);
                intent.putExtra("moon", moon);
                intent.putExtra("eeee", eeee);
                startActivity(intent);
            }
        });
    }
}