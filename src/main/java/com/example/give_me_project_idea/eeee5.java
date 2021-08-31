package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee5 extends AppCompatActivity {
    private Button btn_eeq5;
    private Button btn_egq5;

    private int gige;
    private int gong;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee5);

        btn_eeq5 =findViewById(R.id.btn_eeq5);
        btn_egq5 =findViewById(R.id.btn_egq5);


        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 1;
                gong += 5;
                juju += 1;
                ictt += 1;
                Intent intent = new Intent(eeee5.this, eeee6.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });

        btn_egq5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 2;
                gong += 1;
                juju += 2;
                ictt += 2;
                Intent intent = new Intent(eeee5.this, eeee6.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });
    }
}