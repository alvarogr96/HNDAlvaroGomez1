package com.example.alumnos.hndalvarogomez.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.alumnos.hndalvarogomez.R;
import com.example.alumnos.hndalvarogomez.fragments.AjustesFragment;
import com.example.alumnos.hndalvarogomez.fragments.DescripcionFragment;
import com.example.alumnos.hndalvarogomez.fragments.ObjetosFragment;
import com.example.alumnos.hndalvarogomez.fragments.PerfilFragment;
import com.example.alumnos.hndalvarogomez.fragments.PersonajesFragment;
import com.example.alumnos.hndalvarogomez.fragments.TipsFragment;
import com.example.alumnos.hndalvarogomez.preferences.Preferencias;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.perfil:
                PerfilFragment perfil = PerfilFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container, perfil).commit();
                break;
            case R.id.descripcion:
                DescripcionFragment descripcion = DescripcionFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container, descripcion).commit();
                break;
            case R.id.naves:
                PersonajesFragment personajes = PersonajesFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container, personajes).commit();
                break;
            case R.id.objetos:
                ObjetosFragment objetos = ObjetosFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container,objetos).commit();
                break;
            case R.id.tips:
                TipsFragment tips = TipsFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container,tips).commit();
                break;
            case R.id.ajustes:
                AjustesFragment ajustes = AjustesFragment.newInstance();
                fragmentManager.beginTransaction().replace(R.id.container,ajustes).commit();
                break;
            case R.id.salir:
                Preferencias prefs =new Preferencias(MainActivity.this);
                prefs.setLogin(false);
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
        }

        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawerLayout.closeDrawers();

        return true;
    }
}
