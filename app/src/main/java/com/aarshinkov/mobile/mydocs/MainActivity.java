package com.aarshinkov.mobile.mydocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button menuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBtn = findViewById(R.id.menuButton);

        menuBtn.setOnClickListener(menuOnClick);
    }

    private View.OnClickListener menuOnClick = v -> {
//        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
//        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Menu button clicked", Toast.LENGTH_LONG).show();
    };
}