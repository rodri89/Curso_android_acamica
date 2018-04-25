package com.example.rodrigobanegas.curso_android_acamica;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.rodrigobanegas.curso_android_acamica.adapters.RecyclerViewExampleAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private static String MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();// Añadir la Toolbar

        CollapsingToolbarLayout collapsingToolbarLayout=(CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        if(collapsingToolbarLayout != null){collapsingToolbarLayout.setTitle("Coordinator Layout");}

        LinkedList<String> lista=new LinkedList<>();
        lista.add("Rodrigo");lista.add("Flor");lista.add("Boli");lista.add("Santi");
        lista.add("Lushi");lista.add("August");lista.add("Fede");lista.add("Gabi");
        lista.add("Pepe");lista.add("Carlitos");lista.add("Manes");lista.add("Sol");
        lista.add("Maria");lista.add("Santi");lista.add("Leo");lista.add("Ceci");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);   // ese recycler_view es el id que tengo definido en el xml.
        recyclerView.setAdapter(new RecyclerViewExampleAdapter(lista));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    //#########################  Toolbar  #############################################

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // de este modo definimos que la toolbar va a ser nuestro action bar
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent =null;
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                showSnackBar("Comenzar a buscar...");
                //Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_favourite:
                Toast.makeText(MainActivity.this, "Favourite", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_fragmentStaticos:
                intent = new Intent(this, fragmentStatico.class);
                startActivity(intent);
                return true;
            case R.id.action_fragmentDinamico:
                intent = new Intent(this, fragmentDinamic.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //#########################  Toolbar  FIN #########################################

    private void showSnackBar(String msg) {
        Snackbar
                .make(findViewById(R.id.coordinator), msg, Snackbar.LENGTH_LONG)
                .show();
    }

}

