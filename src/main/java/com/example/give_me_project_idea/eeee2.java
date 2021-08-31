package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee2 extends AppCompatActivity {
    private Button btn_eeq2;
    private Button btn_egq2;

    private int gige;
    private int gong;
    private int bioo;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee2);

        btn_eeq2 =findViewById(R.id.btn_eeq2);
        btn_egq2 =findViewById(R.id.btn_egq2);


        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        bioo = getIntent.getIntExtra("bioo", 0);
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                bioo += 5;
                juju += 2;
                ictt += 2;
                Intent intent = new Intent(eeee2.this, eeee3.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("bioo", bioo);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });

        btn_egq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 2;
                bioo += 0;
                juju += 2;
                ictt += 2;
                Intent intent = new Intent(eeee2.this, eeee3.class);
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