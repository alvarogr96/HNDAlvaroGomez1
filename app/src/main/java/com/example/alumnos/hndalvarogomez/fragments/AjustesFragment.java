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


public class AjustesFragment extends Fragment {


    private TextView txtVersion, txtContacto, txtInfDes;

    public AjustesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_ajustes, container, false);

        txtVersion = (TextView) view.findViewById(R.id.txtVersion);
        txtContacto = (TextView) view.findViewById(R.id.txtContacto);
        txtInfDes = (TextView) view.findViewById(R.id.txtInfDes);



        txtVersion.setText( getString(R.string.version)+" v.1.0.0");
        txtContacto.setText( getString(R.string.contacto) + " alvaro_gomez_apps1m1617@cev.com " );
        txtInfDes.setText( getString(R.string.infDes)+" Estudiante en el centro CEV ");

        return view;
    }

    public static AjustesFragment newInstance() {
        return new AjustesFragment();
    }
}
