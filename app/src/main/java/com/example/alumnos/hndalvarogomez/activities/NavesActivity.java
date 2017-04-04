package com.example.alumnos.hndalvarogomez.activities;

import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.NaveBean;
import com.example.alumnos.hndalvarogomez.fragments.PersonajesFragment;

public class NavesActivity extends AppCompatActivity {

    private ImageView imgNave;
    private TextView txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naves);

       NaveBean naveBean = (NaveBean) getIntent().getSerializableExtra(PersonajesFragment.NAVE_KEY);

        imgNave = (ImageView) findViewById(R.id.imgNave);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);

        txtDescripcion.setText(naveBean.getDescripcion());

        imgNave.setImageDrawable(ContextCompat.getDrawable(this,naveBean.getFoto()));


    }
}
