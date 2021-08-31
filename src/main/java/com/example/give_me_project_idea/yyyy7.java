package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy7 extends AppCompatActivity {
    private Button btn_cd7;
    private Button btn_ck7;
    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy7);

        btn_cd7 =findViewById(R.id.btn_cd7);
        btn_ck7 =findViewById(R.id.btn_ck7);
        Intent getIntent= getIntent();
        cccd = getIntent.getIntExtra("cccd", 0);
        ccck = getIntent.getIntExtra("ccck", 0);
        btn_cd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                if(cccd > ccck) {
                    Intent intent = new Intent(yyyy7.this, PageYYCD.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(yyyy7.this, PageYYCK.class);
                    startActivity(intent);
                }
            }
        });

        btn_ck7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                if(cccd > ccck) {
                    Intent intent = new Intent(yyyy7.this, PageYYCD.class);
                    startActivity(intent);
                } else{
                    Intent intent = new Intent(yyyy7.this, PageYYCK.class);
                    startActivity(intent);
                }
            }
        });
    }
}