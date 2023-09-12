package com.example.tugasbkpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class LinearLayout extends AppCompatActivity {
    
    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        
        username = findViewById(R.id.txtUsername);
        password = findViewById(R.id.txtPassword);
        login = findViewById(R.id.btnLogin);
        
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("1") && password.getText().toString().equals("1")){
                    Toast.makeText(LinearLayout.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LinearLayout.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
                    
            }
        });
        
    }
}