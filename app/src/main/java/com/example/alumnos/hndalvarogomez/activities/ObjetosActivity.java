package com.example.alumnos.hndalvarogomez.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.NaveBean;
import com.example.alumnos.hndalvarogomez.beans.ObjetoBean;
import com.example.alumnos.hndalvarogomez.fragments.ObjetosFragment;
import com.example.alumnos.hndalvarogomez.fragments.PersonajesFragment;

public class ObjetosActivity extends AppCompatActivity {

    private ImageView imgObjeto;
    private TextView txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);

        ObjetoBean objetoBean = (ObjetoBean) getIntent().getSerializableExtra(ObjetosFragment.OBJETO_KEY);

        imgObjeto = (ImageView) findViewById(R.id.imgObjeto);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);

        txtDescripcion.setText(objetoBean.getDescripcion());

        imgObjeto.setImageDrawable(ContextCompat.getDrawable(this,objetoBean.getFoto()));



    }
}
