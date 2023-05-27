package com.example.relaxtopia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class Meditasyon extends AppCompatActivity {

    private Button geri;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditasyon);


        mediaPlayer = MediaPlayer.create(Meditasyon.this, R.raw.meditasyonmuzigi);

        mediaPlayer.start();





    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            mediaPlayer.pause();
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
        }
        return super.onKeyDown(keyCode, event);
    }
}