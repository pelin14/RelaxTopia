package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Yogaaa extends AppCompatActivity {

    private Button lotus_btn,kobra_btn,plank_btn,gunes_btn,savasci_btn;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogaaa);


        lotus_btn = findViewById(R.id.lotus_btn);
        kobra_btn = findViewById(R.id.kobra_btn);
        plank_btn = findViewById(R.id.plank_btn);
        gunes_btn = findViewById(R.id.gunes_btn);
        savasci_btn = findViewById(R.id.savasci_btn);




        lotus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lotus.class);
                startActivity(intent);
            }
        });

        kobra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Kobra.class);
                startActivity(intent);
            }
        });

        plank_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Plank.class);
                startActivity(intent);
            }
        });

        gunes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Gunes.class);
                startActivity(intent);
            }
        });

        savasci_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Savasci.class);
                startActivity(intent);
            }
        });
    }

}