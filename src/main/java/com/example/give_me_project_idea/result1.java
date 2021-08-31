package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result1 extends AppCompatActivity {
    private TextView guess1;
    private TextView tell1;
    private Button btn_con1;
    private int moon;
    private int eeee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_result1);

        guess1 = findViewById(R.id.guess1);
        tell1 = findViewById(R.id.tell1);
        btn_con1 = findViewById(R.id.btn_con1);


        Intent getIntent= getIntent();
        moon = getIntent.getIntExtra("moon", 0);
        eeee = getIntent.getIntExtra("eeee", 0);
        if(moon > eeee) {
            guess1.setText("문과(?)");
            tell1.setText("당신은 이과보단 '문과' 에 더 가까울수도?");

            btn_con1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(result1.this, MYpage1.class);
                    startActivity(intent);
                }
            });
        } else{
            guess1.setText("이과 (?)");
            tell1.setText("당신은 문과보단 '이과' 에 더 가까울수도?");
            btn_con1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(result1.this, EYpage1.class);
                    startActivity(intent);
                }
            });
        }
    }
}