package com.appmbp.mbp8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.appmbp.mbp8.ui.Conseiller_SpinnerActivity;
import com.appmbp.mbp8.ui.Livre_a_conseillerActivity;

public class Mon_ConseillerFragment extends Fragment {

    Activity context;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Mon_ConseillerFragment() {
    }


    public static Mon_ConseillerFragment newInstance(String param1, String param2) {
        Mon_ConseillerFragment fragment = new Mon_ConseillerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.fragment_mon__conseiller, container, false);

    }
    public void onStart(){
        super.onStart();
        Button btn = (Button) context.findViewById(R.id.button_cons);
      /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Conseiller_SpinnerActivity.class);
                startActivity(intent);
            }
        });*/
        /*
        Décocher les commentaires pour activer la fonction qui ouvre l'activity
        Le conseiller à besoin d'être améliorer pour être activer
         */

    }
}