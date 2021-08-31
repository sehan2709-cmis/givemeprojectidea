package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mmmm8 extends AppCompatActivity {
    private Button btn_mnq8;
    private Button btn_mmq8;

    private int ggmn;
    private int gege;
    private int bubu;
    private int samd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mmmm8);

        btn_mnq8 =findViewById(R.id.btn_mnq8);
        btn_mmq8 =findViewById(R.id.btn_mmq8);

        Intent getIntent= getIntent();
        ggmn = getIntent.getIntExtra("ggmn", 0);
        gege = getIntent.getIntExtra("gege", 0);
        bubu = getIntent.getIntExtra("bubu", 0);
        samd = getIntent.getIntExtra("samd", 0);
        btn_mnq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 1;
                gege += 1;
                bubu += 4;
                samd += 1;
                Intent intent = new Intent(mmmm8.this, mmmm9.class);
                intent.putExtra("ggmn", ggmn);
                intent.putExtra("gege", gege);
                intent.putExtra("bubu", bubu);
                intent.putExtra("samd", samd);
                startActivity(intent);
            }
        });

        btn_mmq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 2;
                gege += 2;
                bubu += 1;
                samd += 2;
                Intent intent = new Intent(mmmm8.this, mmmm9.class);
                intent.putExtra("ggmn", ggmn);
                intent.putExtra("gege", gege);
                intent.putExtra("bubu", bubu);
                intent.putExtra("samd", samd);
                startActivity(intent);
            }
        });
    }
}