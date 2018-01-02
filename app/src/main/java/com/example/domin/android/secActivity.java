package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import java.util.ArrayList;

public abstract class  secActivity extends RecyclerView.Adapter<secActivity.ViewHolder> {


    private ArrayList<Places> places = new ArrayList<>();

    secActivity(ArrayList<Places> places)
    {
        this.places = places;
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);
        return new ViewHolder(itemLayoutView);
    }

    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.setPlacesName(places.get(position).getPlaceName());
        holder.setPlacesInformation(places.get(position).getInformation());

    }

    // 16. Zmień wygenerowane metody, aby działały poprawnie:
    //a. onCreate – powinien być setowany .xml,
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView rezultat = (TextView) findViewById(R.id.lista);
        Bundle przekazanedane = getIntent().getExtras();
        String przekazanytekst = przekazanedane.getString("dane");

        rezultat.setText(przekazanytekst);
    }



    //c. onBindView powinno wywoływać metody z viewholdera do uzupełnienia
    // danych na konkretnym itemie.
    public void onBindView(ViewHolder view, int position)
    {
        view.setPlacesName(places.get(position).getPlaceName());
        view.setPlacesInformation(places.get(position).getInformation() + "");
    }



    public ViewHolder onCreate(ViewGroup parent, int viewType)
    {
        View itemLayoutView = LayoutInflater.from(parent.getContext()). inflate(R.layout.list_item, null);
        return new  ViewHolder(itemLayoutView);
    }

    //b. getItemCount powinno zwracać rozmiar listy danych,
    public int getItemCount() {
        return places.size();
    }
}