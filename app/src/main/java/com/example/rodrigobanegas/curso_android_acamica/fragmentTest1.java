package com.example.rodrigobanegas.curso_android_acamica;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rodrigobanegas.curso_android_acamica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentTest1 extends Fragment {


    public fragmentTest1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_test1, container, false);
    }

}