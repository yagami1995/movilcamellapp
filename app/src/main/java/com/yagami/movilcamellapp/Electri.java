package com.yagami.movilcamellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electri extends AppCompatActivity {
    Button buttoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electri);
        buttoon = (Button) findViewById(R.id.buttoon);
        buttoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buttoon = new Intent(Electri.this,Calcular3.class);
                startActivity(buttoon);
            }
        });
    }
}