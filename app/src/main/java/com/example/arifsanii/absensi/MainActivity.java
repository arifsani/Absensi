package com.example.arifsanii.absensi;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user,pass;
Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userkey = user.getText().toString();
                String password = pass.getText().toString();

                if (userkey.equals("admin")&& password.equals("admin")){

                Toast.makeText(getApplicationContext(),"Login sukses",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            else Toast.makeText(getApplicationContext(),"Username atau Password salah !!",Toast.LENGTH_SHORT).show();}
        });

    }
}
