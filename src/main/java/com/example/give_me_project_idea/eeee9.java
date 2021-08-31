package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee9 extends AppCompatActivity {
    private Button btn_eeq9;
    private Button btn_egq9;

    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee9);

        btn_eeq9 =findViewById(R.id.btn_eeq9);
        btn_egq9 =findViewById(R.id.btn_egq9);

        Intent getIntent= getIntent();
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ictt += 2;
                juju += 4;
                if(ictt > juju) {
                    Intent intent = new Intent(eeee9.this, EEICTT.class);
                    startActivity(intent);
                } else if(ictt <= juju) {
                    Intent intent = new Intent(eeee9.this, EEJUJU.class);
                    startActivity(intent);
                }
            }
        });

        btn_egq9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ictt += 4;
                juju += 2;
                if(ictt > juju) {
                    Intent intent = new Intent(eeee9.this, EEICTT.class);
                    startActivity(intent);
                } else if(ictt <= juju) {
                    Intent intent = new Intent(eeee9.this, EEJUJU.class);
                    startActivity(intent);
                }
            }
        });
    }
}