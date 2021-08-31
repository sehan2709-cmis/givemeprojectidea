package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageFour extends AppCompatActivity {


    private Button btn_m4;
    private Button btn_e4;
    private int moon;
    private int eeee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_page_four);

        btn_m4 =findViewById(R.id.btn_m4);
        btn_e4 =findViewById(R.id.btn_e4);
        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        eeee = getIntent.getIntExtra("eeee", 0);

        btn_m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moon += 1;
                Intent intent = new Intent(pageFour.this, pageFive.class);
                intent.putExtra("moon", moon);
                intent.putExtra("eeee", eeee);
                startActivity(intent);
            }
        });

        btn_e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(pageFour.this, pageFive.class);
                intent.putExtra("moon", moon);
                intent.putExtra("eeee", eeee);
                startActivity(intent);
            }
        });
    }
}