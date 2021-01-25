package com.aarshinkov.mobile.mydocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private TextView loginNoAccountTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.loginBtn);
        loginNoAccountTV = findViewById(R.id.loginNoAccountTV);

        loginNoAccountTV.setOnClickListener(onClick);
    }

    private final View.OnClickListener onClick = v -> {
        if (v.getId() == R.id.loginNoAccountTV) {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    };
}