package com.example.firebasealexis3jv.FragmentosCliente;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.firebasealexis3jv.InicioSesion;
import com.example.firebasealexis3jv.R;


public class AcerDeCliente extends Fragment {

   Button Acceder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_acer_de_cliente, container, false);

        Acceder = view.findViewById(R.id.Acceder);

        Acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InicioSesion.class));
            }
        });

        return view;
    }
}