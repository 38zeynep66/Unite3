package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uygulama5goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uygulama4goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uygulama1goster(View view) {Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uygulama2goster(View view) {Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }
}