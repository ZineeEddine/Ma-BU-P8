package com.appmbp.mbp8;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.appmbp.mbp8.ui.Conseiller_SpinnerActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Regle_PretFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Regle_PretFragment extends Fragment {

    Button btn_cl;
    Activity context;
    boolean running;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Regle_PretFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Regle_PretFragment.
     */
    // TODO: Rename and change types and number of parameters


    public static Regle_PretFragment newInstance(String param1, String param2) {
        Regle_PretFragment fragment = new Regle_PretFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    /*    if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }*/





    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();



        return inflater.inflate(R.layout.fragment_regle__pret, container, false);





    }

    public void onStart(){
        super.onStart();
        Button btn_cl = (Button) context.findViewById(R.id.button_cl);
        btn_cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cl = new Intent(Intent.ACTION_VIEW);
                Uri dt = Uri.parse("https://catalogue.bu.univ-paris8.fr/cgi-bin/koha/opac-user.pl");
                cl.setData(dt);
                startActivity(Intent.createChooser(cl,"Compte lecteur"));
            }
        });

    }
    public void onn(){

        gotoUrl("https://catalogue.bu.univ-paris8.fr/cgi-bin/koha/opac-user.pl");

    }
    private void gotoUrl(String s){

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}