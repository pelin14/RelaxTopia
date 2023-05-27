package com.example.relaxtopia;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class articless2 extends Fragment {

    TextView textView_articless;
    ImageView imageView_articless;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_articless2, container, false);

        textView_articless =view.findViewById(R.id.textView_articless);
        imageView_articless=view.findViewById(R.id.imageView_articless);

        Bundle bundle = this.getArguments();



        if(bundle!=null){
            String ac=getArguments().getString("arg1");
            textView_articless.setText(ac);
            Bitmap artic_img = getArguments().getParcelable("arg2");
            imageView_articless.setImageBitmap(artic_img);

        }
        return view;
    }
}