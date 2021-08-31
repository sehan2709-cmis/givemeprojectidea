package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage2 extends AppCompatActivity {
    private Button btn_ee2;
    private Button btn_ye2;
    private int eeee;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage2);

        btn_ee2 =findViewById(R.id.btn_ee2);
        btn_ye2 =findViewById(R.id.btn_ye2);
        Intent getIntent= getIntent();
        eeee = getIntent.getIntExtra("eeee", 0);
        yyyy = getIntent.getIntExtra("yyyy", 0);
        btn_ee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(EYpage2.this, EYpage3.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_ye2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(EYpage2.this, EYpage3.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}