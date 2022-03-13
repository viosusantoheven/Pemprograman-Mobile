package com.example.fragment4;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class VoltFragment extends Fragment {
    EditText etArus, etHambatan ;
    Button btnAmphere , btnVolt ;
    CallbackFragment callbackFragment ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_volt, container, false);
         etArus = view.findViewById(R.id.etArus) ;
         etHambatan = view.findViewById(R.id.etHambatan) ;
         btnAmphere = view.findViewById(R.id.btnAmphere) ;
         btnVolt = view.findViewById(R.id.btnVolt) ;

         btnVolt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

             }
         });

        btnAmphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callbackFragment != null)
                    callbackFragment.changeFragment();

            }
        });
         return view ;
    }
    public void setCallbackFragment (CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment ;

    }

}