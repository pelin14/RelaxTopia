package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yeniyoga extends AppCompatActivity {
    private Button lotusbtnn,kobrabtnn,plankbtnn,gunesbtnn,savascibtnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeniyoga);

        lotusbtnn =  findViewById(R.id.lotus_btn);
        kobrabtnn = findViewById(R.id.kobra_btn);
        plankbtnn = findViewById(R.id.plank_btn);
        gunesbtnn = findViewById(R.id.gunes_btn);
        savascibtnn = findViewById(R.id.savasci_btn);
    }


}