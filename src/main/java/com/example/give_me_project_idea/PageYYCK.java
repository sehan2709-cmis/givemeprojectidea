package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageYYCK extends AppCompatActivity {
    private Button yyck_again;
    private Button yyck_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_page_y_y_c_k);
        yyck_others = findViewById(R.id.yyck_others);
        yyck_again = findViewById(R.id.yyck_again);

        yyck_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageYYCK.this, MainActivity.class);
                startActivity(intent);
            }
        });

        yyck_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageYYCK.this, AllHak.class);
                startActivity(intent);
            }
        });
    }
}