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
    public static ArrayList<NaveBean> getNaves(){

        ArrayList<NaveBean> naves= new ArrayList<>();

        naves.add(new NaveBean(R.drawable.boss, "Boss", "Jefe final que te aparece una vez estes llegando al final. Tiene una gran cantidad de vida y una vez que le hayas bajado la mitad de la vida entrará en furia y disparará nuevos proyectiles"));
        naves.add(new NaveBean(R.drawable.protagonista, "Protagonista", "Es la nave que usa el jugador. Tienes municion infinita y puedes recoger nuevos proyectiles por el mapa."));
        naves.add(new NaveBean(R.drawable.enemigonormal, "Enemigo comun", "Enemigo que te aparece repetitivamente y muere de un disparo."));



        return naves;
    }
    public static ArrayList<ObjetoBean>getObjetos(){

        ArrayList<ObjetoBean> objetos= new ArrayList<>();

        objetos.add(new ObjetoBean(R.drawable.asteroide, "Asteroide", "Objeto que debes tratar de esquivar o perderás. "));
        objetos.add(new ObjetoBean(R.drawable.planeta, "Planeta", "Objeto que simplemente esta para decorar. "));

        return objetos;
    }
    public static ArrayList<TipsBean>getTips(){

        ArrayList<TipsBean> tips= new ArrayList<>();

        tips.add(new TipsBean("Consejo básico", "Trata de moverte hacia arriba y hacia abajo constantemente para esquivar los asteroides."));

        return tips;
    }



}
