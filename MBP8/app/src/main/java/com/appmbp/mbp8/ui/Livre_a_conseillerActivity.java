package com.appmbp.mbp8.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.appmbp.mbp8.R;

public class Livre_a_conseillerActivity extends AppCompatActivity {

   // Déclaration de il de type ImageView on aurait pu écrire un autre mot à la place de il
    ImageView il;
    TextView txt_titre,txt_auteur, txt_edition,txt_date_publication,txt_description,txt_localisation,txt_cote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livre_aconseiller);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /* va servir a faire en sorte d'afficher la flèche et que l'on puisse retourner à la page
        précédente maois ne pas oublier d'ecrire dans le fichier Manisfest.xml:
        - android:parentActivityName=".MainActivity" dans  l'activity


         */
     //   il=(ImageView) findViewById(R.id.imageView_a_conseiler);
        txt_titre = (TextView) findViewById(R.id.text_titre);
        txt_auteur = (TextView) findViewById(R.id.text_auteur);
        txt_edition = (TextView) findViewById(R.id.text_edition);
        txt_date_publication = (TextView) findViewById(R.id.text_date_publication);
        txt_description = (TextView) findViewById(R.id.text_description);
        txt_localisation = (TextView) findViewById(R.id.text_localisation);
        txt_cote = (TextView) findViewById(R.id.text_cote);

        /*
        Reception de l'image envoyer depuis l'activity précédente grâçe à bundle de type Bundle:
        qui est égale à getIntent et getExtras
        tant que bundle est nul, on déclare:
        int resid =  qui rcupere l'Id (de notre image) avec getInt

        et

        il.setImageRessource va servir a set du coups crée initialisé l'image par l'id obtenu


         */
       Bundle bundle = getIntent().getExtras();
        if(bundle != null){
           // int resid = bundle.getInt("resId");
           // il.setImageResource(resid);

            int resid_titre = bundle.getInt("resId_titre");
            txt_titre.setText(resid_titre);

            int resid_auteur = bundle.getInt("resId_auteur");
            txt_auteur.setText(resid_auteur);

            int resid_edition = bundle.getInt("resId_edition");
            txt_edition.setText(resid_edition);

            int resid_date = bundle.getInt("resId_date");
            txt_date_publication.setText(resid_date);

            int resid_description = bundle.getInt("resId_decription");
            txt_description.setText(resid_description);

            int resid_localisation = bundle.getInt("resId_localisation");
            txt_localisation.setText(resid_localisation);

            int resid_cote = bundle.getInt("resId_cote");
            txt_cote.setText(resid_cote);

        }


    }
}
