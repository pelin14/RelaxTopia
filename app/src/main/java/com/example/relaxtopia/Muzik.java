package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class Muzik extends AppCompatActivity {

    ImageButton relax1btn,relax2btn,relax3btn,relax4btn;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzik);

        relax1btn=findViewById(R.id.imageButton4);
        mediaPlayer1 = MediaPlayer.create(Muzik.this, R.raw.relax1);



        relax1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();

                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                }
                else if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                }
                else {
                    if(mediaPlayer4.isPlaying()){
                        mediaPlayer4.pause();
                    }

                }

            }
        });

        relax2btn=findViewById(R.id.imageButton5);
        mediaPlayer2 = MediaPlayer.create(Muzik.this, R.raw.relax2);

        relax2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();

                if(mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                }
                else if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                }
                else {
                    if(mediaPlayer4.isPlaying()){
                        mediaPlayer4.pause();
                    }

                }
            }
        });

        relax3btn=findViewById(R.id.imageButton6);
        mediaPlayer3 = MediaPlayer.create(Muzik.this, R.raw.relax3);

        relax3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();

                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                }
                else if(mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                }
                else {
                    if(mediaPlayer4.isPlaying()){
                        mediaPlayer4.pause();
                    }

                }
            }
        });

        relax4btn=findViewById(R.id.imageButton7);
        mediaPlayer4 = MediaPlayer.create(Muzik.this, R.raw.pixases);

        relax4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();

                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                }
                else if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                }
                else {
                    if(mediaPlayer1.isPlaying()){
                        mediaPlayer1.pause();
                    }

                }
            }
        });


    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mediaPlayer1.pause();
            mediaPlayer2.pause();
            mediaPlayer3.pause();
            mediaPlayer4.pause();
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
        }
        return super.onKeyDown(keyCode, event);
    }
}