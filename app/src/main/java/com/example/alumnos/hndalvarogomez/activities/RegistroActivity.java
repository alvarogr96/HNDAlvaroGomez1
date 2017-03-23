package com.example.alumnos.hndalvarogomez.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alumnos.hndalvarogomez.R;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editNombre, editApellidos, editUsuario, editContraseña, editCorreo;
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editNombre = (EditText) findViewById(R.id.editNombre);
        editApellidos = (EditText) findViewById(R.id.editApellidos);
        editUsuario = (EditText) findViewById(R.id.editUsuario);
        editContraseña = (EditText) findViewById(R.id.editContraseña);
        editCorreo = (EditText) findViewById(R.id.editCorreo);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);

        btnRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
