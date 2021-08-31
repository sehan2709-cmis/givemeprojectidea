package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mmmm1 extends AppCompatActivity {
    private Button btn_mnq1;
    private Button btn_mmq1;

    private int ggmn;
    private int gege;
    private int bubu;
    private int samd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mmmm1);

        btn_mnq1 =findViewById(R.id.btn_mnq1);
        btn_mmq1 =findViewById(R.id.btn_mmq1);

        ggmn = 1;
        gege = 1;
        bubu = 1;
        samd = 1;
        btn_mnq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 1;
                gege += 3;
                bubu += 1;
                samd += 1;
                Intent intent = new Intent(mmmm1.this, mmmm2.class);
                intent.putExtra("ggmn", ggmn);
                intent.putExtra("gege", gege);
                intent.putExtra("bubu", bubu);
                intent.putExtra("samd", samd);
                startActivity(intent);
            }
        });

        btn_mmq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 2;
                gege += 1;
                bubu += 2;
                samd += 2;
                Intent intent = new Intent(mmmm1.this, mmmm2.class);
                intent.putExtra("ggmn", ggmn);
                intent.putExtra("gege", gege);
                intent.putExtra("bubu", bubu);
                intent.putExtra("samd", samd);
                startActivity(intent);
            }
        });
    }
}