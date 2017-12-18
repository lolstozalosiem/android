package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;





import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.wpisz) EditText wpisane;
    @BindView(R.id.zmienmiejsce) EditText zmienButton;
    @BindView(R.id.miasto) EditText tutaj;
    @BindView(R.id.pokaz) EditText poka;

    @OnClick(R.id.zmienmiejsce)
    void change(){
        tutaj.setText(wpisane.getText().toString());
    }

    @OnClick(R.id.pokaz)
    void changeone()
    {
        String wpisanyTekst = tutaj.getText().toString();

        Bundle koszyk = new Bundle();
        koszyk.putString("dane", wpisanyTekst);

        Intent cel = new Intent(getApplicationContext(),secActivity.class);
        cel.putExtras(koszyk);

        startActivity(cel);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);



        //wpisane = (EditText) findViewById(R.id.wpisz);
        //zmienButton = (Button) findViewById(R.id.zmienmiejsce);
       // tutaj = (TextView) findViewById(R.id.miasto);
        //poka =(Button)findViewById(R.id.pokaz);

        //zmienButton.setOnClickListener(new View.OnClickListener()



        //  poka.setOnClickListener(new View.OnClickListener() {

               // @Override
              //  public void onClick(View v) {



    }





    }
    }



