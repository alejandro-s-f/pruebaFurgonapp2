package com.example.pruebafurgonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    //metodo para boton volver
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}