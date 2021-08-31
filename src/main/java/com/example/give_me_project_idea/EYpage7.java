package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage7 extends AppCompatActivity {
    private Button btn_ee7;
    private Button btn_ye7;
    private int eeee;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage7);

        btn_ee7 =findViewById(R.id.btn_ee7);
        btn_ye7 =findViewById(R.id.btn_ye7);
        Intent getIntent= getIntent();
        eeee = getIntent.getIntExtra("eeee", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_ee7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                if(eeee > yyyy) {
                    Intent intent = new Intent(EYpage7.this, result4.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(EYpage7.this, result3.class);
                    startActivity(intent);
                }
            }
        });

        btn_ye7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                if(eeee > yyyy) {
                    Intent intent = new Intent(EYpage7.this, result4.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(EYpage7.this, result3.class);
                    startActivity(intent);
                }
            }
        });
    }
}