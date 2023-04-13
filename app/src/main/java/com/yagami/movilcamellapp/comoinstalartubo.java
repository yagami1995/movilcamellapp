package com.yagami.movilcamellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class comoinstalartubo extends AppCompatActivity {
Button buttoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comoinstalartubo);
        buttoon = (Button) findViewById(R.id.buttoon);
        buttoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttoon = new Intent(comoinstalartubo.this,Calcular.class);
                startActivity(buttoon);
            }
        });
    }}