package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage4 extends AppCompatActivity {
    private Button btn_ee4;
    private Button btn_ye4;
    private int eeee;
    private int yyyy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage4);

        btn_ee4 =findViewById(R.id.btn_ee4);
        btn_ye4 =findViewById(R.id.btn_ye4);
        Intent getIntent= getIntent();
        eeee = getIntent.getIntExtra("eeee", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_ee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(EYpage4.this, EYpage5.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_ye4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(EYpage4.this, EYpage5.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}