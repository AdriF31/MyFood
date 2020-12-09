package com.adri.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    Button btn_login;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        password=findViewById(R.id.password);
        username= findViewById(R.id.username);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cek username dan password
                if(username.getText().toString().equals("Adri") && password.getText().toString().equals("1234"))
                {
                    Intent i = new Intent (login.this,MainActivity.class);
                    startActivity(i);

                    finish();
                }
            }
        });
    }
}
