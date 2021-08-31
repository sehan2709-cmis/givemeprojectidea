package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy6 extends AppCompatActivity {
    private Button btn_cd6;
    private Button btn_ck6;
    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy6);

        btn_cd6 =findViewById(R.id.btn_cd6);
        btn_ck6 =findViewById(R.id.btn_ck6);
        Intent getIntent= getIntent();
        cccd = getIntent.getIntExtra("cccd", 0);
        ccck = getIntent.getIntExtra("ccck", 0);
        btn_cd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                Intent intent = new Intent(yyyy6.this, yyyy7.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });

        btn_ck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                Intent intent = new Intent(yyyy6.this, yyyy7.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });
    }
}