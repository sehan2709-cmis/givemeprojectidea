package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy1 extends AppCompatActivity {
    private Button btn_cd1;
    private Button btn_ck1;

    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy1);

        btn_cd1 =findViewById(R.id.btn_cd1);
        btn_ck1 =findViewById(R.id.btn_ck1);

        cccd = 1;
        ccck = 1;
        btn_cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                Intent intent = new Intent(yyyy1.this, yyyy2.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });

        btn_ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                Intent intent = new Intent(yyyy1.this, yyyy2.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });
    }
}