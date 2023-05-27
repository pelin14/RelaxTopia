package com.example.relaxtopia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeeActivity extends AppCompatActivity {

    private BottomNavigationView mBottomBar;
    private HomeeeFragment homeeeFragment;
    private ArticlessFragment articlessFragment;
    private ProfileeFragment profileeFragment;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);


        mBottomBar = (BottomNavigationView) findViewById(R.id.homee_activity_bottomNavigationView);
        homeeeFragment = new HomeeeFragment();
        articlessFragment = new ArticlessFragment();
        profileeFragment = new ProfileeFragment();

        setFragment(homeeeFragment);

        mBottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.bottombar_menu_home:
                        setFragment(homeeeFragment);
                        return true;

                    case R.id.bottombar_menu_articles:
                        setFragment(articlessFragment);
                        return true;

                    case R.id.bottombar_menu_profile:
                        setFragment(profileeFragment);
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

        private void setFragment(Fragment fragment){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.homee_activity_framelayout,fragment);
            transaction.commit();

        }
}