package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Plank extends AppCompatActivity {

    private TextView timerValue;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);

        timerValue = findViewById(R.id.timerValue3);

        new CountDownTimer(4000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                timerValue.setText(f.format(min) + ":" + f.format(sec));
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                timerValue.setText("00:00");
                Intent intent = new Intent(Plank.this,Gunes.class);
                startActivity(intent);
            }
        }.start();
    }
}