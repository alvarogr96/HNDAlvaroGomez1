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
import com.example.alumnos.hndalvarogomez.activities.ObjetosActivity;
import com.example.alumnos.hndalvarogomez.adapters.ObjetosAdapter;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;
import com.example.alumnos.hndalvarogomez.test.Modelo;

import java.util.ArrayList;


public class ObjetosFragment extends Fragment  implements AdapterView.OnItemClickListener {

    private ListView listObjetos;
    private ArrayList<ObjetoBean> objetos;
    public static final String OBJETO_KEY="OBJETO_KEY";

    public ObjetosFragment() {
        // Required empty public constructor
    }
    public static ObjetosFragment newInstance() {

        return new ObjetosFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_objetos, container, false);
        listObjetos = (ListView) view.findViewById(R.id.listObjetos);
        objetos = Modelo.getObjetos();
        ObjetosAdapter adapter = new ObjetosAdapter(getActivity(), R.layout.item_objetos, objetos);
        listObjetos.setAdapter(adapter);
        listObjetos.setOnItemClickListener(this);
        return  view;
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

    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        ObjetoBean objetoBean = objetos.get(posicion);
        Intent intent = new Intent(getActivity(), ObjetosActivity.class);
        intent.putExtra(OBJETO_KEY, objetoBean);

        startActivity(intent);
    }

}
