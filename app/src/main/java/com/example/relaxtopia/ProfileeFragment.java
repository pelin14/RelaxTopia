package com.example.relaxtopia;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;

public class ProfileeFragment extends Fragment {

    Chronometer kronometre;
    Button basladur,restart;

    long fark;

    int deger=0;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profilee, container, false);

        kronometre = view.findViewById(R.id.kronometre);
        basladur = view.findViewById(R.id.basladur);
        restart = view.findViewById(R.id.restart);

        basladur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(deger==0){
                    kronometre.setBase(SystemClock.elapsedRealtime());
                    kronometre.start();
                    basladur.setText("    DURDUR");
                    deger=1;
                }else if(deger==1){
                    fark=SystemClock.elapsedRealtime();
                    kronometre.stop();
                    basladur.setText("  DEVAM ETTİR");
                    deger=2;
                }else{
                    kronometre.setBase(kronometre.getBase() + SystemClock.elapsedRealtime() - fark);
                    basladur.setText("    DURDUR");
                    kronometre.start();
                    deger=1;
                }
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kronometre.setBase(SystemClock.elapsedRealtime());
                kronometre.start();
                basladur.setText("    DURDUR");
                deger = 1;
            }
        });


        return view;


    }
}