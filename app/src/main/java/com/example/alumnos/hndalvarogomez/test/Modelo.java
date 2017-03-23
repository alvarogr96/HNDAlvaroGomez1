package com.example.alumnos.hndalvarogomez.test;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.NaveBean;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;
import com.example.alumnos.hndalvarogomez.beans.TipsBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class Modelo {
    /*
    *  MÉTODO QUE DEVUELVA UN ARRAY DE NAVES
    *  MÉTODO QUE DEVUELVA UN ARRAY DE OBJETOS
    *  MÉTODO QUE DEVUELVA UN ARRAY DE TIPS
    * */
    public ArrayList<NaveBean>getNaves(){

        ArrayList<NaveBean> naves= new ArrayList<>();

        naves.add(new NaveBean(R.drawable.Boss, "Boss", "Jefe final que te aparece una vez estes llegando al final. Tiene una gran cantidad de vida y una vez que le hayas bajado la mitad de la vida entrará en furia y disparará nuevos proyectiles"));
        naves.add(new NaveBean(R.drawable.Protagonista, "Protagonista", "Es la nave que usa el jugador. Tienes municion infinita y puedes recoger nuevos proyectiles por el mapa."));
        naves.add(new NaveBean(R.drawable.EnemigoNormal, "Enemigo comun", "Enemigo que te aparece repetitivamente y muere de un disparo."));



        return naves;
    }
    public ArrayList<ObjetoBean>getObjetos(){

        ArrayList<ObjetoBean> objetos= new ArrayList<>();

       // objetos.add(new ObjetoBean(, "Asteroide"));

        return objetos;
    }
    public ArrayList<TipsBean>getTips(){

        ArrayList<TipsBean> tips= new ArrayList<>();

        return tips;
    }



}
