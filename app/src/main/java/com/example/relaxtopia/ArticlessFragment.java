package com.example.relaxtopia;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArticlessFragment extends Fragment {

    ListView listem;
    private ArrayAdapter<String> adapter;
    private String [] makale_baslik = {"Stres nasıl yönetilir?",
            "Yüz yogası nedir?",
            "Meditasyon nedir,nasıl başlamalıyız?",
            "Olumlama nedir? Neden ihtiyaç duyarız?",
            "Yoga ve Meditasyon arasında nasıl bir ilişki var?",
            "Yoganın vücudumuza faydaları nelerdir?",
            "Her gün yoga yaparsak ne olur?",
            "Yoganın Doğuşu","Meditasyonun Tarihi","Yoga ne zaman yapılmalıdır?"
            ,"Hangi yoga türünün yapılacağına nasıl karar verilir?"};

    private int [] makale_foto = {R.drawable.bir,
            R.drawable.iki,
            R.drawable.uc,
            R.drawable.dort,
            R.drawable.bes,
            R.drawable.alti,
            R.drawable.yedi,
            R.drawable.sekiz,
            R.drawable.dokuz,
            R.drawable.onn,
            R.drawable.onbir};

    private int [] makale_aciklama={R.string.makale_bir,
            R.string.makale_iki,
            R.string.makale_uc,
            R.string.makale_dort,
            R.string.makale_bes,
            R.string.makale_alti,
            R.string.makale_yedi,
            R.string.makale_sekiz,
            R.string.makale_dokuz,
            R.string.makale_onn,
            R.string.makale_onbir};

    private Bitmap makale_foto_sec;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_articless, container, false);


        listem=view.findViewById(R.id.listem);
        adapter=new ArrayAdapter<>(view.getContext(), android.R.layout.simple_expandable_list_item_1,makale_baslik);
        listem.setAdapter(adapter);

        listem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                int makale_aciklamaa = makale_aciklama[i];
                String aciklama= getString(makale_aciklamaa);
                bundle.putString("arg1",aciklama);
                makale_foto_sec= BitmapFactory.decodeResource(getActivity().getApplicationContext().getResources(),makale_foto[i]);
                bundle.putParcelable("arg2",makale_foto_sec);
                articless2 fragment2 = new articless2();
                fragment2.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.homee_activity_framelayout,fragment2).commit();
            }
        });

        return view;
    }
}