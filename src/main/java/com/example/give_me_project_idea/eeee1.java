package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee1 extends AppCompatActivity {
    private Button btn_eeq1;
    private Button btn_egq1;

    private int gige;
    private int gong;
    private int bioo;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee1);

        btn_eeq1 =findViewById(R.id.btn_eeq1);
        btn_egq1 =findViewById(R.id.btn_egq1);

        gige = 1;
        gong = 1;
        bioo = 1;
        juju = 1;
        ictt= 1;
        btn_eeq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                bioo += 10;
                juju += 2;
                ictt += 2;
                Intent intent = new Intent(eeee1.this, eeee2.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("bioo", bioo);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });

        btn_egq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                bioo += 0;
                juju += 2;
                ictt += 2;
                Intent intent = new Intent(eeee1.this, eeee2.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("bioo", bioo);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });
    }
}