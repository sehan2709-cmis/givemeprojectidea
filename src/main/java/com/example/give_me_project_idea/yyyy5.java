package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy5 extends AppCompatActivity {
    private Button btn_cd5;
    private Button btn_ck5;
    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy5);

        btn_cd5 =findViewById(R.id.btn_cd5);
        btn_ck5 =findViewById(R.id.btn_ck5);
        Intent getIntent= getIntent();
        cccd = getIntent.getIntExtra("cccd", 0);
        ccck = getIntent.getIntExtra("ccck", 0);
        btn_cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                Intent intent = new Intent(yyyy5.this, yyyy6.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });

        btn_ck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                Intent intent = new Intent(yyyy5.this, yyyy6.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });
    }
}