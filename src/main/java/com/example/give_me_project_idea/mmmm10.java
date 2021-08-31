package com.example.give_me_project_idea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mmmm10 extends AppCompatActivity {
    private Button btn_mnq10;
    private Button btn_mmq10;

    private int ggmn;
    private int gege;
    private int bubu;
    private int samd;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_mmmm10);

        btn_mnq10 =findViewById(R.id.btn_mnq10);
        btn_mmq10 =findViewById(R.id.btn_mmq10);

        Intent getIntent= getIntent();
        ggmn = getIntent.getIntExtra("ggmn", 0);
        gege = getIntent.getIntExtra("gege", 0);
        bubu = getIntent.getIntExtra("bubu", 0);
        samd = getIntent.getIntExtra("samd", 0);
        result = 0;
        btn_mnq10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 1;
                gege += 3;
                bubu += 1;
                samd += 2;
                result = greatest(ggmn, gege, bubu, samd);
                if(result == 1){
                    Intent intent = new Intent(mmmm10.this, MMGGMN.class);
                    startActivity(intent);
                } else if(result == 2){
                    Intent intent = new Intent(mmmm10.this, MMGEGE.class);
                    startActivity(intent);
                }else if(result == 3){
                    Intent intent = new Intent(mmmm10.this, MMBUBU.class);
                    startActivity(intent);
                }else if(result == 4){
                    Intent intent = new Intent(mmmm10.this, MMSAMD.class);
                    startActivity(intent);
                }
            }
        });

        btn_mmq10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ggmn += 3;
                gege += 1;
                bubu += 2;
                samd += 1;
                result = greatest(ggmn, gege, bubu, samd);
                if(result == 1){
                    Intent intent = new Intent(mmmm10.this, MMGGMN.class);
                    startActivity(intent);
                } else if(result == 2){
                    Intent intent = new Intent(mmmm10.this, MMGEGE.class);
                    startActivity(intent);
                }else if(result == 3){
                    Intent intent = new Intent(mmmm10.this, MMBUBU.class);
                    startActivity(intent);
                }else if(result == 4){
                    Intent intent = new Intent(mmmm10.this, MMSAMD.class);
                    startActivity(intent);
                }
            }
        });
    }

    int greatest(int a, int b, int c, int d){
        int res = 0;
        if(a >= b && a >= c && a >= d){ res = 1;}
        else if(b >= a && b >= c && b >= d){ res = 2;}
        else if(c >= b && c >= a && c >= d){ res = 3;}
        else if(d >= b && d >= c && d >= a){ res = 4;}
        return(res);
    }
}
