package com.example.xcode.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import data.restPlato;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restPlato platos=new restPlato(getApplicationContext());
        platos.obtenerPlatos("5723f44ea0546936289eab1e");

    }
}
