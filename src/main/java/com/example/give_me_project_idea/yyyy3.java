package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yyyy3 extends AppCompatActivity {
    private Button btn_cd3;
    private Button btn_ck3;
    private int cccd;
    private int ccck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yyyy3);

        btn_cd3 =findViewById(R.id.btn_cd3);
        btn_ck3 =findViewById(R.id.btn_ck3);
        Intent getIntent= getIntent();
        cccd = getIntent.getIntExtra("cccd", 0);
        ccck = getIntent.getIntExtra("ccck", 0);
        btn_cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cccd += 1;
                Intent intent = new Intent(yyyy3.this, yyyy4.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });

        btn_ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccck += 1;
                Intent intent = new Intent(yyyy3.this, yyyy4.class);
                intent.putExtra("cccd", cccd);
                intent.putExtra("ccck", ccck);
                startActivity(intent);
            }
        });
    }
}