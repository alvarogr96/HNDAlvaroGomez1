package com.example.alumnos.hndalvarogomez.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.activities.NavesActivity;
import com.example.alumnos.hndalvarogomez.adapters.NavesAdapter;
import com.example.alumnos.hndalvarogomez.beans.NaveBean;
import com.example.alumnos.hndalvarogomez.test.Modelo;

import java.util.ArrayList;


public class PersonajesFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listPersonajes;
    private ArrayList<NaveBean> naves;
    public static final String NAVE_KEY="NAVE_KEY";


    public PersonajesFragment() {
        // Required empty public constructor
    }

    public static PersonajesFragment newInstance() {

        return new PersonajesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_personajes, container, false);
        listPersonajes = (ListView) view.findViewById(R.id.listPersonajes);
        naves = Modelo.getNaves();
        NavesAdapter adapter = new NavesAdapter(getActivity(), R.layout.item_naves, naves);
        listPersonajes.setAdapter(adapter);
        listPersonajes.setOnItemClickListener(this);
        return view;
    }

 @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        NaveBean navebean = naves.get(position);
        Intent intent = new Intent(getActivity(), NavesActivity.class);
        intent.putExtra(NAVE_KEY, navebean);

        startActivity(intent);
    }
}
