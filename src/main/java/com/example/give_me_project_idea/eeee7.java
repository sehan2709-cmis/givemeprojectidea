package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee7 extends AppCompatActivity {
    private Button btn_eeq7;
    private Button btn_egq7;

    private int gige;
    private int gong;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee7);

        btn_eeq7 =findViewById(R.id.btn_eeq7);
        btn_egq7 =findViewById(R.id.btn_egq7);


        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 1;
                gong += 1;
                juju += 3;
                ictt += 5;
                if(gige+gong > juju+ictt) {
                    Intent intent = new Intent(eeee7.this, eeee8.class);
                    intent.putExtra("gige", gige);
                    intent.putExtra("gong", gong);
                    startActivity(intent);
                } else if(gige+gong <= juju+ictt) {
                    Intent intent = new Intent(eeee7.this, eeee9.class);
                    intent.putExtra("juju", juju);
                    intent.putExtra("ictt", ictt);
                    startActivity(intent);
                }
            }
        });

        btn_egq7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 3;
                gong += 3;
                juju += 3;
                ictt += 0;
                if(gige+gong > juju+ictt) {
                    Intent intent = new Intent(eeee7.this, eeee8.class);
                    intent.putExtra("gige", gige);
                    intent.putExtra("gong", gong);
                    startActivity(intent);
                } else if(gige+gong <= juju+ictt) {
                    Intent intent = new Intent(eeee7.this, eeee9.class);
                    intent.putExtra("juju", juju);
                    intent.putExtra("ictt", ictt);
                    startActivity(intent);
                }
            }
        });
    }
}