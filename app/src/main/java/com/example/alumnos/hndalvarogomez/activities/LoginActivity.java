package com.example.alumnos.hndalvarogomez.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.UsuarioBean;
import com.example.alumnos.hndalvarogomez.preferences.Preferencias;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editNombre, editPassword;
    private Button btnEntrar, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Preferencias preferencias = new Preferencias(LoginActivity.this);
        if (preferencias.isLogin() == false) {
            editNombre = (EditText) findViewById(R.id.editNombre);
            editPassword = (EditText) findViewById(R.id.editPassword);
            btnEntrar = (Button) findViewById(R.id.btnEntrar);
            btnRegistro = (Button) findViewById(R.id.btnRegistro);

            btnEntrar.setOnClickListener(this);
            btnRegistro.setOnClickListener(this);
        } else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnEntrar:
                String nombre = editNombre.getText().toString();
                String password = editPassword.getText().toString();
                if (nombre != null && password != null && !nombre.isEmpty() && !password.isEmpty()) {
                    Preferencias preferencias = new Preferencias(LoginActivity.this);
                    UsuarioBean usuarioBean = preferencias.getUsuario();
                    if (usuarioBean.getUsuario() != null) {
                        if (nombre.equals(usuarioBean.getUsuario()) && password.equals(usuarioBean.getPassword())) {

                            preferencias.setLogin(true);
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, getString(R.string.datosIncorrectos), Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, getString(R.string.datosExistentes), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, getString(R.string.datosObligatorios), Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btnRegistro:
                Intent intent2 = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent2);
                finish();
                break;


        }
    }
}
