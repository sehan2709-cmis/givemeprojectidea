package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage6 extends AppCompatActivity {
    private Button btn_ee6;
    private Button btn_ye6;
    private int eeee;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage6);

        btn_ee6 =findViewById(R.id.btn_ee6);
        btn_ye6 =findViewById(R.id.btn_ye6);
        Intent getIntent= getIntent();
        eeee = getIntent.getIntExtra("eeee", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_ee6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(EYpage6.this, EYpage7.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_ye6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(EYpage6.this, EYpage7.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}