package com.example.domin.android;


import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {


    // 2. Zmień w projekcie wszystkie findViewById na:
    //@BindView(R.id.nazwa_view)


    @BindView(R.id.wpisz) EditText wpisane;
    @BindView(R.id.zmienmiejsce) EditText zmienButton;
    @BindView(R.id.miasto) EditText tutaj;
    @BindView(R.id.pokaz) EditText poka;


// 18. W pierwszej aktywności zmień zawartość ImageView z Drawable na obrazek
// związanym z pogodą, z linku URL. Wykorzystaj do tego bibliotekę Glide

 // link URL do wybranego obrazka
    String imgUrl = "https://www.google.pl/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjqv-Kr5LnYAhWFIVAKHRXjDYUQjRwIBw&url=https%3A%2F%2Fwww.superkid.pl%2Fkrzyzowki-online-pogoda&psig=AOvVaw2K09werDUAOHSqNWxPTAG_&ust=1514998854223192";
// metoda szukająca id ImageView
    ImageView imageView = (ImageView) getView().findViewById(R.id.image);
// wykorzystanie biblioteki Glide
    Glide.With(this)
            .load(imgUrl) // załadowanie linku
            .into(imageView) // wpisanie linku do ImageView



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

        // 1. Dodaj bindowanie z ButterKnifa do aktywności
        ButterKnife.bind(this);


        //wpisane = (EditText) findViewById(R.id.wpisz);
        //zmienButton = (Button) findViewById(R.id.zmienmiejsce);
        // tutaj = (TextView) findViewById(R.id.miasto);
        //poka =(Button)findViewById(R.id.pokaz);


        // 3. Zamień wszystkie setOnClickListener na:
        // @OnClick (R.id.nazwa_view)
        //void onClick() { }


        //zmienButton.setOnClickListener(new View.OnClickListener()
        //  poka.setOnClickListener(new View.OnClickListener() {

        // @Override
        //  public void onClick(View v) {


        // 13. Stworzenie listy places
        ArrayList<Place> places = new ArrayList<>();
        // 13. Dodanie obiektów do listy places
        places.add(new Place("Zabrze", "Słonecznie"));
        places.add(new Place("Ruda Slaska", "Pochmurnie"));
        places.add(new Place("Katowice", "Deszczowo"));


        // 11. Stworzenie LayoutManagera
        // 12. Ustawienie go na adapterze
        RecyclerView.LayoutManager lm = new LinearLayoutManager((getApplicationContext()));
        rV.setLayoutManager(lm);

        // 11. Stworzenie Adaptera
        secActivity placeAdapter = new secActivity(places);
        rV.setAdapter(placeAdapter);

    }
}


