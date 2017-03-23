package com.example.alumnos.hndalvarogomez.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class NaveBean implements Serializable {
    private int foto;
    private String nombre, descripcion;

    public NaveBean() {
    }

    public NaveBean(int foto, String nombre, String descripcion) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toJson(){
        Gson gson = new Gson();

        return gson.toJson(this);

    }
    public static NaveBean fromJson(String json){
        Gson gson = new Gson();

        NaveBean naveBean = gson.fromJson(json, NaveBean.class);

        return naveBean;

    }
}
