package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result3 extends AppCompatActivity {
    private Button btn_con3;
    private Button to_yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_result3);
        btn_con3 = findViewById(R.id.btn_con3);
        to_yyyy = findViewById(R.id.to_yyyy);

        btn_con3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result3.this, yyyy1.class);
                startActivity(intent);
            }
        });

        to_yyyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result3.this, yyyyHack.class);
                startActivity(intent);
            }
        });
    }
}