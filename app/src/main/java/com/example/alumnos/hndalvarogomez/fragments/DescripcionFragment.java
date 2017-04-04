package com.example.alumnos.hndalvarogomez.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;


public class DescripcionFragment extends Fragment {

    private TextView descripcion;

    public DescripcionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descripcion, container, false);

        descripcion = (TextView) view.findViewById(R.id.descripcion);

        descripcion.setText("Juego en 2D en el cual deberás ir matando a los enemigos mientras esquivas los obstaculas que te saldrán a lo largo del mapa." +
                "Deberas superar niveles hasta llegar al jefe final.");
        return  view;
    }


    public static DescripcionFragment newInstance() {
        return new DescripcionFragment();
    }
}
