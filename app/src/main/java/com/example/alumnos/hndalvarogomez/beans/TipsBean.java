package com.example.alumnos.hndalvarogomez.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class TipsBean implements Serializable {
    public String descripcion;

    public TipsBean() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toJson(){
        Gson gson = new Gson();

        return gson.toJson(this);

    }
    public static Object fromJson(String json){
        Gson gson = new Gson();

        ObjetoBean objetoBean = gson.fromJson(json, ObjetoBean.class);

        return objetoBean;


    }
}
