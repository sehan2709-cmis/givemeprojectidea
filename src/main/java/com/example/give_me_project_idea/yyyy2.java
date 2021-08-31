package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy2 extends AppCompatActivity {
    private Button btn_cd2;
    private Button btn_ck2;
    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy2);

        btn_cd2 =findViewById(R.id.btn_cd2);
        btn_ck2 =findViewById(R.id.btn_ck2);
        Intent getIntent= getIntent();
        cccd = getIntent.getIntExtra("cccd", 0);
        ccck = getIntent.getIntExtra("ccck", 0);
        btn_cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                Intent intent = new Intent(yyyy2.this, yyyy3.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });

        btn_ck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                Intent intent = new Intent(yyyy2.this, yyyy3.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });
    }
}