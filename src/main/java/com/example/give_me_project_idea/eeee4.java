package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eeee4 extends AppCompatActivity {
    private Button btn_eeq4;
    private Button btn_egq4;

    private int gige;
    private int gong;
    private int juju;
    private int ictt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eeee4);

        btn_eeq4 =findViewById(R.id.btn_eeq4);
        btn_egq4 =findViewById(R.id.btn_egq4);


        Intent getIntent= getIntent();
        gige = getIntent.getIntExtra("gige", 0);
        gong = getIntent.getIntExtra("gong", 0);
        juju = getIntent.getIntExtra("juju", 0);
        ictt = getIntent.getIntExtra("ictt", 0);
        btn_eeq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 4;
                gong += 4;
                juju += 3;
                ictt += 2;
                Intent intent = new Intent(eeee4.this, eeee5.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });

        btn_egq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gige += 0;
                gong += 1;
                juju += 3;
                ictt += 3;
                Intent intent = new Intent(eeee4.this, eeee5.class);
                intent.putExtra("gige", gige);
                intent.putExtra("gong", gong);
                intent.putExtra("juju", juju);
                intent.putExtra("ictt", ictt);
                startActivity(intent);
            }
        });
    }
}