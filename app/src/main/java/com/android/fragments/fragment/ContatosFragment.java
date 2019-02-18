package com.android.fragments.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {

    private TextView textContato;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Criamos uma variavel (view) para retornar o resultado de inflater
        View view =  inflater.inflate(R.layout.fragment_contatos, container, false);

        //para utilizar o findViewById precisamos primeiro do view, assim poderemos fazer todas as alterações
        textContato = view.findViewById(R.id.textContatosId);

        textContato.setText("Contato alterado");

        return view;
    }

}
