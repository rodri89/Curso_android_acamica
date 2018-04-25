package com.example.rodrigobanegas.curso_android_acamica;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fragmentDinamic extends FragmentActivity {
    private Button crearFragment;
    private static final String DINAMIC_FRAGMENT_TAG= "DINAMIC_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamic);


        Button crearFragment = (Button) findViewById(R.id.button);
        crearFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragment fragment1 = new fragment();
                fragmentTransaction.replace(android.R.id.content, fragment1)
                        .commit();

               /* FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment,new fragment(),DINAMIC_FRAGMENT_TAG);
                transaction.commit();*/
            }
        });

    }
}
