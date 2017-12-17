package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText wpisane;
    Button zmienButton;
    TextView tutaj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wpisane = (EditText) findViewById(R.id.wpisz);
        zmienButton = (Button) findViewById(R.id.zmienmiejsce);
        tutaj = (TextView) findViewById(R.id.miasto);

        zmienButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                tutaj.setText(wpisane.getText().toString());

            }


        });


        Intent intent = new Intent(getApplicationContext()),activity_sec.Class);
        startActivity(intent);
        Bundle bundle = new Bundle(); bundle.putString(„klucz” , „nasze miasto”;
        intent.putExtras(bundle);

    }
}



