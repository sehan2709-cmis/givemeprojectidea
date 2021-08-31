package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result4 extends AppCompatActivity {
    private Button to_eeee;
    private Button btn_con4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_result4);
        to_eeee = findViewById(R.id.to_eeee);
        btn_con4 = findViewById(R.id.btn_con4);

        to_eeee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result4.this, eeeeHack.class);
                startActivity(intent);
            }
        });

        btn_con4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(result4.this, eeee1.class);
                startActivity(intent);
            }
        });
    }
}