package com.example.domin.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView rezultat = (TextView) findViewById(R.id.lista);
        Bundle przekazanedane = getIntent().getExtras();
        String przekazanytekst = przekazanedane.getString("dane");

        rezultat.setText(przekazanytekst);
    }


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


    public int getItemCount() {
        return places.size();
    }
}