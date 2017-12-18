package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;

public class secActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        //Intent intent = getIntent();
        //string message = intent.getStringExtra("klucz");
        // lista = (TextView) findViewById(R.id.lista);
        //lista = (TextView) findViewById(R.id.message);
        // lista.setText(message);

        TextView rezultat = (TextView) findViewById(R.id.lista);
        Bundle przekazanedane = getIntent().getExtras();
        String przekazanytekst = przekazanedane.getString("dane");

        rezultat.setText(przekazanytekst);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Zabrze", "Słonecznie"));

        


    }



}