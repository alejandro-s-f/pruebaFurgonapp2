package com.example.pruebafurgonapp;

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

    //metodo para ir a registro
    public void Registrar(View view){
        Intent registrarUsuario = new Intent(this, SelectorRegistroActivity.class);
        startActivity(registrarUsuario);
    }
}