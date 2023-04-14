package com.yagami.movilcamellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ceramica extends AppCompatActivity {
    Button buttoon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttoon = (Button) findViewById(R.id.buttoon);
        buttoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttoon = new Intent(Ceramica.this,Calcular2.class);
                startActivity(buttoon);
            }
        });

}}