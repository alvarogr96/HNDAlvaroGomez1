package com.example.alumnos.hndalvarogomez.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.beans.UsuarioBean;
import com.example.alumnos.hndalvarogomez.preferences.Preferencias;
import com.example.alumnos.hndalvarogomez.utils.Utils;

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
        String nombre = editNombre.getText().toString();
        String apellidos = editApellidos.getText().toString();
        String usuario = editUsuario.getText().toString();
        String pass = editContraseña.getText().toString();
        String correo = editCorreo.getText().toString();

        if( nombre!=null && apellidos!=null &&usuario!=null && pass!=null && correo!=null &&
               !nombre.isEmpty() && !apellidos.isEmpty()&& !usuario.isEmpty() && !pass.isEmpty() && !correo.isEmpty()) {
            //email formato correcto, pass y pass2 iguales

            if(Utils.isEmail(correo)) {


                UsuarioBean usuarioBean = new UsuarioBean(nombre, apellidos, usuario, pass, correo);
                Preferencias prefs = new Preferencias(RegistroActivity.this);
                prefs.setUsuario(usuarioBean);
                Toast.makeText(RegistroActivity.this,
                        getString(R.string.registroCorrecto),
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(RegistroActivity.this,
                        getString(R.string.mailInc),
                        Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(RegistroActivity.this,
                    getString(R.string.campos),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
