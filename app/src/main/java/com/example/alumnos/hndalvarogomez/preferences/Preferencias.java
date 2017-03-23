package com.example.alumnos.hndalvarogomez.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.alumnos.hndalvarogomez.beans.UsuarioBean;

/**
 * Created by ALUMNOS on 10/03/2017.
 */

public class Preferencias {
private Context context;
    private final String PREFERENCIAS = "preferencias";
    private final String USUARIO = "usuario";


    public void setUsuario(UsuarioBean usuarioBean){

        String usuarioJson = usuarioBean.toJson();

        SharedPreferences prefs = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString(USUARIO, usuarioJson);
        editor.commit();
    }
    public UsuarioBean getUsuario(){
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
        String usuarioJson = prefs.getString(USUARIO,"");
        return UsuarioBean.fromJson(usuarioJson);

    }

}
