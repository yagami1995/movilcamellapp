package com.yagami.movilcamellapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Manualconstruayuda extends AppCompatActivity {
CardView card_view;
CardView card_view2;
CardView card_view3;
CardView card_view4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualconstruayuda);
        card_view = findViewById(R.id.card_view);
        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_view = new Intent(Manualconstruayuda.this,comoinstalartubo.class);
                startActivity(card_view);
            }
        });
        card_view2 = findViewById(R.id.card_view2);
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_view2 = new Intent(Manualconstruayuda.this,Ceramica.class);
                startActivity(card_view2);
            }
        });
        card_view3 = findViewById(R.id.card_view3);
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_view3= new Intent(Manualconstruayuda.this,Electri.class);
                startActivity(card_view3);
            }
        });
        card_view4 = findViewById(R.id.card_view4);
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_view4= new Intent(Manualconstruayuda.this,Techo.class);
                startActivity(card_view4);
            }
        });




    }

    public void comoinstalar(View view) {
        Intent funcion=new Intent(this,comoinstalartubo.class);
        startActivity(funcion);


    }


    public void comoinstalarcera(View view) {
        Intent funcion=new Intent(this,Ceramica.class);
        startActivity(funcion);
    }

    public void Electri(View view) {
        Intent funcion=new Intent(this,Electri.class);
        startActivity(funcion);
    }

    public void Techo(View view) {
        Intent funcion=new Intent(this,Techo.class);
        startActivity(funcion);
    }
}
