package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

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


    }


}