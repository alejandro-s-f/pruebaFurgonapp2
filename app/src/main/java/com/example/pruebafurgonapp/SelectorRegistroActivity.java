package com.example.pruebafurgonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectorRegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector_registro);
    }

    public void Volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

    public void irRegistroApoderado(View view){
        Intent registrarApoderado = new Intent(this, registroActivity.class);
        startActivity(registrarApoderado);
    }

    public void irRegistroChofer(View view){
        Intent registrarChofer = new Intent(this, registroChoferActivity.class);
        startActivity(registrarChofer);
    }
}