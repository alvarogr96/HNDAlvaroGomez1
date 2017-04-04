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
import com.example.alumnos.hndalvarogomez.beans.UsuarioBean;
import com.example.alumnos.hndalvarogomez.preferences.Preferencias;

public class PerfilFragment extends Fragment {


    private TextView  nombre, apellidos, nombreUsuario, email;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_perfil, container, false);

        nombre = (TextView) view.findViewById(R.id.nombre);
        apellidos = (TextView) view.findViewById(R.id.apellidos);
        nombreUsuario = (TextView) view.findViewById(R.id. nombreUsuario);
        email = (TextView) view.findViewById(R.id.email);

        Preferencias prefs = new Preferencias(getActivity());
        UsuarioBean usuariobean = prefs.getUsuario();

        nombre.setText("Nombre: " + usuariobean.getNombre());
        apellidos.setText("Apellidos: " + usuariobean.getApellidos());
        nombreUsuario.setText("Nombre de usuario: " + usuariobean.getUsuario());
        email.setText("Correo: " + usuariobean.getCorreo());

 return view;
    }

    public static PerfilFragment newInstance() {
        return new PerfilFragment();
    }
}
