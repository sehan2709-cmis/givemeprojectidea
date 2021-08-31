package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageYYCD extends AppCompatActivity {
    private Button yycd_again;
    private Button yycd_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_page_y_y_c_d);
        yycd_others = findViewById(R.id.yycd_others);
        yycd_again = findViewById(R.id.yycd_again);

        yycd_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageYYCD.this, MainActivity.class);
                startActivity(intent);
            }
        });

        yycd_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageYYCD.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}