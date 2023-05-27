package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText kullaniciadi, parola;
    Button btnlogin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        kullaniciadi = (EditText) findViewById(R.id.username1);
        parola = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String klnc = kullaniciadi.getText().toString();
                String prl = parola.getText().toString();



                if(klnc.equals("")||prl.equals(""))
                    Toast.makeText(LoginActivity.this, "Lütfen tüm alanları girin", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(klnc, prl);
                    if(checkuserpass==true){
                        Toast.makeText(LoginActivity.this, "Giriş başarıyla yapıldı", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), HomeeActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this, "Geçersiz giriş bilgileri\n", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}