package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage5 extends AppCompatActivity {
    private Button btn_ee5;
    private Button btn_ye5;
    private int eeee;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage5);

        btn_ee5 =findViewById(R.id.btn_ee5);
        btn_ye5 =findViewById(R.id.btn_ye5);
        Intent getIntent= getIntent();
        eeee = getIntent.getIntExtra("eeee", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_ee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(EYpage5.this, EYpage6.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_ye5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(EYpage5.this, EYpage6.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}