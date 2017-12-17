package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;





import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText wpisane;
    Button zmienButton;
    TextView tutaj;
    Button poka;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wpisane = (EditText) findViewById(R.id.wpisz);
        zmienButton = (Button) findViewById(R.id.zmienmiejsce);
        tutaj = (TextView) findViewById(R.id.miasto);
        poka =(Button)findViewById(R.id.pokaz);

        zmienButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tutaj.setText(wpisane.getText().toString());

            }
        });



          poka.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    tutaj = (TextView) findViewById(R.id.miasto);
                    // pobranie tekstu z zmiennej tutaj (posiadająca tekst z pola miasto)
                    String wpisanyTekst = tutaj.getText().toString();
                    // pobrany tekst zostaje wpakowany w Bundle
                    Bundle koszyk = new Bundle();
                    koszyk.putString("dane", wpisanyTekst);
                    // definicja celu za pomocą Intent
                    Intent cel = new Intent(getApplicationContext(),secActivity.class);
                    cel.putExtras(koszyk);
                    // wysłanie
                    startActivity(cel);

                    ;}


          });
    }

    }



