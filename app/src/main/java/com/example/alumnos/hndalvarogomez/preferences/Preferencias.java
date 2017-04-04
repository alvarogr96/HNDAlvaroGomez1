package com.example.alumnos.hndalvarogomez.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.alumnos.hndalvarogomez.activities.RegistroActivity;
import com.example.alumnos.hndalvarogomez.beans.UsuarioBean;

/**
 * Created by ALUMNOS on 10/03/2017.
 */
public class Preferencias {
    private Context context;
    private final String PREFERENCIAS = "preferencias";
    private final String USUARIO = "usuario";
    private final String LOGIN = "login";


    public Preferencias(Context context) {
        this.context = context;
    }

    public void setUsuario(UsuarioBean usuarioBean) {

        String usuarioJson = usuarioBean.toJson();

        SharedPreferences prefs = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString(USUARIO, usuarioJson);
        editor.commit();
    }

    public UsuarioBean getUsuario() {
        SharedPreferences prefs = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);

        String usuarioJson = prefs.getString(USUARIO, "");
        return UsuarioBean.fromJson(usuarioJson);

    }

    public void setLogin(boolean login) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(LOGIN,login);

        editor.commit();
    }
    public boolean isLogin(){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCIAS,
                Context.MODE_PRIVATE);

        return sharedPreferences.getBoolean(LOGIN, false);
    }
}
