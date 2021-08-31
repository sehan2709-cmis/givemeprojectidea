package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee3 extends AppCompatActivity {
    private Button btn_eeq3;
    private Button btn_egq3;

    private int gige;
    private int gong;
    private int bioo;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee3);

        btn_eeq3 =findViewById(R.id.btn_eeq3);
        btn_egq3 =findViewById(R.id.btn_egq3);


        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        bioo = getIntent.getIntExtra("bioo", 0);
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                bioo += 5;
                juju += 2;
                ictt += 2;
                if(bioo >= 13) {
                    Intent intent = new Intent(eeee3.this, EEBIOO.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(eeee3.this, eeee4.class);
                    intent.putExtra("gige", gige);
                    intent.putExtra("gong", gong);
                    intent.putExtra("juju", juju);
                    intent.putExtra("ictt", ictt);
                    startActivity(intent);
                }
            }
        });

        btn_egq3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                juju += 2;
                ictt += 2;
                if(bioo >= 13) {
                    Intent intent = new Intent(eeee3.this, EEBIOO.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(eeee3.this, eeee4.class);
                    intent.putExtra("gige", gige);
                    intent.putExtra("gong", gong);
                    intent.putExtra("juju", juju);
                    intent.putExtra("ictt", ictt);
                    startActivity(intent);
                }
            }
        });
    }
}