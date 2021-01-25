package com.aarshinkov.mobile.mydocs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private TextView registerHaveAccountTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerHaveAccountTV = findViewById(R.id.registerHaveAccountTV);

        registerHaveAccountTV.setOnClickListener(onClick);
    }

    private final View.OnClickListener onClick = v -> {
        if (v.getId() == R.id.registerHaveAccountTV) {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    };
}