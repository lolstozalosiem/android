package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {





    @BindView(R.id.wpisz) EditText wpisane;
    @BindView(R.id.zmienmiejsce) EditText zmienButton;
    @BindView(R.id.miasto) EditText tutaj;
    @BindView(R.id.pokaz) EditText poka;



    String imgUrl = "https://www.google.pl/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjqv-Kr5LnYAhWFIVAKHRXjDYUQjRwIBw&url=https%3A%2F%2Fwww.superkid.pl%2Fkrzyzowki-online-pogoda&psig=AOvVaw2K09werDUAOHSqNWxPTAG_&ust=1514998854223192";
    ImageView imageView = (ImageView) findViewById(R.id.image);


         Glide.with(this)
                 .load(imgUrl)
                 .into(imageView);



// stworzenie BindView dla RecyclerView
    @BindView(R.id.rV)
    RecyclerView rV;


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


        // stworzenie listy places
        ArrayList<Place> places = new ArrayList<>();
        // dodanie obiektów do listy places
        places.add(new Place("Zabrze", "Słonecznie"));
        places.add(new Place("Ruda Slaska", "Pochmurnie"));
        places.add(new Place("Katowice", "Deszczowo"));


        // stworzenie LayoutManagera i ustawienie go na adapterze
        RecyclerView.LayoutManager lm = new LinearLayoutManager((getApplicationContext()));
        rV.setLayoutManager(lm);

        // stworzenie adaptera
        secActivity placeAdapter = new secActivity(places);
        rV.setAdapter(placeAdapter);

    }
}


