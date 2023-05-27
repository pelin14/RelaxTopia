package com.example.relaxtopia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeeeFragment extends Fragment {

    private ImageButton yogi_btn,med_btn,nefes_btn,muzik_btn;

    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_homeee, container, false);
        yogi_btn = view.findViewById(R.id.yogi_btn);
        yogi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Yogaaa.class);
                startActivity(intent);
            }
        });

        View view2 = inflater.inflate(R.layout.fragment_homeee, container, false);
        med_btn = view.findViewById(R.id.med_btn);
        med_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Meditasyon.class);
                startActivity(intent);
            }
        });

        View view3 = inflater.inflate(R.layout.fragment_homeee, container, false);
        nefes_btn = view.findViewById(R.id.nefes_btn);
        nefes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Nefes.class);
                startActivity(intent);
            }
        });

        View view4 = inflater.inflate(R.layout.fragment_homeee, container, false);
        muzik_btn = view.findViewById(R.id.muzik_btn);
        muzik_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Muzik.class);
                startActivity(intent);
            }
        });
        return view;

    }
}