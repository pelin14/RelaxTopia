package com.example.relaxtopia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText kullaniciadi, parola, yeniparola;
    Button kayitbtn, girisbtn;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullaniciadi = (EditText) findViewById(R.id.username);
        parola = (EditText) findViewById(R.id.password);
        yeniparola = (EditText) findViewById(R.id.repassword);
        kayitbtn = (Button) findViewById(R.id.btnsignup);
        girisbtn = (Button) findViewById(R.id.btnsignin);
        DB = new DBHelper(this);

        kayitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = kullaniciadi.getText().toString();
                String pass = parola.getText().toString();
                String repass = yeniparola.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(MainActivity.this, "Lütfen tüm alanları girin", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(MainActivity.this, "Başarıyla kayıt olundu", Toast.LENGTH_SHORT).show();

                            }else{
                                Toast.makeText(MainActivity.this, "Kayıt başarısız", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "\n" +
                                    "Kullanıcı zaten var! Lütfen giriş yapın", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Parolalar eşleşmiyor", Toast.LENGTH_SHORT).show();
                    }
                } }
        });

        girisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}