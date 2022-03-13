package com.example.fragment4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class AmphereFragment extends Fragment {

    EditText etTegangan, etHambatan ;
    Button btnAmphere , btnVolt ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_amphere, container, false);
        etTegangan = view.findViewById(R.id.etTegangan) ;
        etHambatan = view.findViewById(R.id.etHambatan) ;
        btnAmphere = view.findViewById(R.id.btnAmphere) ;
        btnVolt = view.findViewById(R.id.btnVolt) ;

        btnAmphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }

        });

        return view ;

    }


}