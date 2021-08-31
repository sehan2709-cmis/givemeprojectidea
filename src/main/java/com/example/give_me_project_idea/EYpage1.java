package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EYpage1 extends AppCompatActivity {

    private Button btn_ee1;
    private Button btn_ye1;

    private int eeee;
    private int yyyy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_e_ypage1);

        btn_ee1 =findViewById(R.id.btn_ee1);
        btn_ye1 =findViewById(R.id.btn_ye1);

        eeee = 1;
        yyyy = 1;
        btn_ee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eeee += 1;
                Intent intent = new Intent(EYpage1.this, EYpage2.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });

        btn_ye1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yyyy += 1;
                Intent intent = new Intent(EYpage1.this, EYpage2.class);
                intent.putExtra("eeee", eeee);
                intent.putExtra("yyyy", yyyy);
                startActivity(intent);
            }
        });
    }
}