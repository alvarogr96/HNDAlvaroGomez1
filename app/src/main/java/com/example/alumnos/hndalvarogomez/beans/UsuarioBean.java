package com.example.alumnos.hndalvarogomez.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 10/03/2017.
 */

public class UsuarioBean implements Serializable{
    private  String nombre, apellidos, usuario, password, correo;

    public UsuarioBean() {
    }

    public UsuarioBean(String nombre, String apellidos, String usuario, String password, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

public String toJson(){
    Gson gson = new Gson();

    return gson.toJson(this);

}
    public static UsuarioBean fromJson(String json){
        Gson gson = new Gson();

       UsuarioBean usuarioBean = gson.fromJson(json, UsuarioBean.class);

        return usuarioBean;

    }
}
