package com.appmbp.mbp8.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.appmbp.mbp8.R;

import java.util.ArrayList;

public class Conseiller_SpinnerActivity extends AppCompatActivity {

    Spinner spinner_Parent, spinner_Child;
    Button button_open_page;

    ArrayList<String> arrayList_Parent;
    ArrayAdapter<String> arrayAdapter_Parent;

    ArrayList<String> arrayList_BUT_DUT, arrayList_Licences, arrayList_Licences_pro,arrayList_Master,arrayList_Master_ens;
    ArrayAdapter arrayAdapter_Child;

    ArrayList<String> arrayList_Parent2;
    ArrayAdapter<String> arrayAdapter_Parent2;

    private int counter_for = 0;
    /* va servir pour savoir quel item de la liste parent(principale la list des formation) a ete
     selectionner */
    private int counter_for_i = 0;
    /* va servir pour savoir quel item de la liste child(ar rapport a la list parent) a ete
     selectionner */
    private int counter_for_master= 0;
    /*


    RESTE  A FAIRE
    DESIGN DU SPINNER
    REFAIRE UN NV LOGO

    ADAPTER TTT TAILE D ECRAN

   partager l app
   noter l app


   zoom photo marche pas



     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conseiller_spinner);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinner_Parent = findViewById(R.id.spinnerParent);
        spinner_Child = findViewById(R.id.spinnerChild);
        button_open_page = findViewById(R.id.button_cons_livre);

        arrayList_Parent = new ArrayList<>();
        arrayList_Parent.add("BUT / DUT");
        arrayList_Parent.add("Licences");
        arrayList_Parent.add("Licences Professionnelles");
        arrayList_Parent.add("Master");
        arrayList_Parent.add("Master de l'enseignement");


        arrayAdapter_Parent = new ArrayAdapter<>(this, R.layout.textview_blue, arrayList_Parent);
        spinner_Parent.setAdapter(arrayAdapter_Parent);

        // ===================== child spinner process starts =====================

        arrayList_BUT_DUT = new ArrayList<>();
        arrayList_BUT_DUT.add("BUT/DUT Gestion Administrative et Commerciale des Organisations");
        arrayList_BUT_DUT.add("BUT/DUT Gestion des Entreprises et des Administrations");
        arrayList_BUT_DUT.add("BUT/DUT Informatique");
        arrayList_BUT_DUT.add("BUT/DUT Information - communication");
        arrayList_BUT_DUT.add("BUT/DUT Qualité, Logistique Industrielle et Organisation");
        arrayList_BUT_DUT.add("BUT/DUT Génie industriel et maintenance");
        arrayList_BUT_DUT.add("BUT/DUT Gestion logistique et transport");


        arrayList_Licences = new ArrayList<>();
        arrayList_Licences.add("Licence Administration Economique et Sociale (AES)");
        arrayList_Licences.add("Licence Cinéma");
        arrayList_Licences.add("Licence Droit");
        arrayList_Licences.add("Licence Economie et gestion");
        arrayList_Licences.add("Licence Études théâtrales");
        arrayList_Licences.add("Licence Géographie et aménagement");
        arrayList_Licences.add("Licence Histoire");
        arrayList_Licences.add("Double licence Histoire - LLCER Mondes anglophones");
        arrayList_Licences.add("Double licence Histoire - Science politique");
        arrayList_Licences.add("Licence Informatique");
        arrayList_Licences.add("Licence Langues Etrangères Appliquées (LEA)");
        arrayList_Licences.add("Licence LLCER Etudes européennes et internationales");
        arrayList_Licences.add("Licence LLCER Mondes anglophones");
        arrayList_Licences.add("Licence LLCER Mondes arabes");
        arrayList_Licences.add("Licence LLCER Mondes hispaniques");
        arrayList_Licences.add("Licence Lettres");
        arrayList_Licences.add("Licence Mathématiques");
        arrayList_Licences.add("Licence Musicologie");
        arrayList_Licences.add("Licence Philosophie");
        arrayList_Licences.add("Licence Psychologie");
        arrayList_Licences.add("Licence Sciences de l’éducation");
        arrayList_Licences.add("Licence Sciences du langage");
        arrayList_Licences.add("Licence Science politique");
        arrayList_Licences.add("Licence Sociologie");

        arrayList_Licences_pro = new ArrayList<>();
        arrayList_Licences_pro.add("Licence professionnelle Commerce et distribution");
        arrayList_Licences_pro.add("Licence professionnelle Communication Interactive et Multimédia");
        arrayList_Licences_pro.add("Licence professionnelle Concepteur de Systèmes d’Information, Développeur-JEE/AGILE");
        arrayList_Licences_pro.add("Licence professionnelle Coordonnateur des améliorations des processus d’entreprise");
        arrayList_Licences_pro.add("Licence professionnelle Droit et gestion de copropriété et syndic");
        arrayList_Licences_pro.add("Licence professionnelle Droit social et ressources humaines");
        arrayList_Licences_pro.add("Licence professionnelle E-commerce et marketing numérique");
        arrayList_Licences_pro.add("Licence professionnelle Enseignement de la langue des signes française en milieu scolaire");
        arrayList_Licences_pro.add("Licence professionnelle Logistique des filières aéroportuaires");
        arrayList_Licences_pro.add("Licence professionnelle Techniques journalistiques pour les nouveaux médias");

        arrayList_Master = new ArrayList<>();
        arrayList_Master.add("Domaine arts");
        arrayList_Master.add("Domaine droit, économie, gestion");
        arrayList_Master.add("Domaine lettres et langues");
        arrayList_Master.add("Domaine sciences humaines et sociales");
        arrayList_Master.add("Domaine sciences, technologies, santé");


        arrayList_Master_ens = new ArrayList<>();
        arrayList_Master_ens.add("Master MEEF 2nd degré, anglais");
        arrayList_Master_ens.add("Master MEEF 2nd degré, arts plastiques");
        arrayList_Master_ens.add("Master MEEF 2nd degré, éducation musicale et chant choral");
        arrayList_Master_ens.add("Master MEEF 2nd degré, espagnol");
        arrayList_Master_ens.add("Master MEEF 2nd degré, histoire-géographie");
        arrayList_Master_ens.add("Master MEEF 2nd degré, langue des signes française (LSF)");
        arrayList_Master_ens.add("Master MEEF 2nd degré, lettres");
        arrayList_Master_ens.add("Master MEEF 2nd degré, sciences économiques et sociales");


        spinner_Parent.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                    System.out.println("saisie utilisateur but dut");
                    counter_for= position;
                    spinner_Child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            if(position==0){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==1){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==2){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==3){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==4){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==5){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                            if(position==6){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_BUT_DUT);
                                counter_for_i = position;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }

                if (position == 1){
                    arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                    System.out.println("saisie utilisateur licences");
                    counter_for= position;
                    spinner_Child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            if(position==0){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==1){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==2){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==3){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==4){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==5){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==6){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==7){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==8){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==9){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==10){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==11){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==12){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==13){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==14){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==15){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==16){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==17){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==18){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==19){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==20){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==21){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==22){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                            if(position==23){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences);
                                counter_for_i = position;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }

                if (position == 2){
                    arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                    System.out.println("saisie utilisateur licences pro");
                    counter_for= position;
                    spinner_Child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position==0){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==1){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==2){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==3){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red,arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==4){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==5){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==6){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==7){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red,arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==8){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                            if(position==9){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red,arrayList_Licences_pro);
                                counter_for_i = position;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                }

                if (position == 3){
                    arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                    System.out.println("saisie utilisateur master");
                    counter_for= position;
                    spinner_Child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position==0){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                                counter_for_i = position;
                            }
                            if(position==1){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                                counter_for_i = position;
                            }
                            if(position==2){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                                counter_for_i = position;
                            }
                            if(position==3){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                                counter_for_i = position;
                            }
                            if(position==4){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master);
                                counter_for_i = position;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if (position == 4){
                    arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                    System.out.println("saisie utilisateur master ens");
                    counter_for= position;
                    spinner_Child.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position==0){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==1){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==2){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==3){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==4){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==5){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==6){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                            if(position==7){
                                arrayAdapter_Child = new ArrayAdapter<>(getApplicationContext(), R.layout.textview_red, arrayList_Master_ens);
                                counter_for_i = position;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                spinner_Child.setAdapter(arrayAdapter_Child);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button_open_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_for(counter_for,counter_for_i);

                // openActivity_Livre_a_conseiller();
                // System.out.println(counter_for);

            }
        });
    }

    /*public void openActivity_Livre_a_conseiller(){
        Intent intent= new Intent(this, Livre_a_conseillerActivity.class);
        startActivity(intent);
    }*/

    public void openActivity_for(int i, int j){



        /*
        La fonction openActivity_for va ouvrir une nouvelle activity qui s'apelle Livre_a_conseiller
        dans laquel on va faire apparaître le livre qu'il faut conseiller a l'utilisateur :

        il faut une Intent pour transferer la photo d'une activiity A à B
        putExtra va nous servir à récupérer la photo
        -putExtra à besoin de 2 paramètre: Id et la ressource (R.id.RESSOURCE)
        startActivity(ze) va lancer l'acctivity
        -startActivity prend 1 paramètre qui est une Intent : ze
        !!!ze!!! n'est que la déclaration d'une intent on aurait bien pu ecrire test ou a ou b


        System.out.println va me servir à voir au niveau de la console pour suivre les étape
        des clique si j'ai appuyer sur l'item 1 ou 5 ou 4

        par exemple pour le 1er exemple:
        if ( i == 0 && j == 0)

        si i == 0 donc l'item BUT/DUT dans le spinner_parent est cliquer j'ai mis une la variable:
        counter_for qui va être égale à 0 vu que c'est l'item 0 qui est selectionner

        et puis

        si j == 0 donc dans le spinner_child va apparaître si l'item selectionner du spinner_child
        est selectionner l'incrément une variable qui est counter_for_i qui va être égale à 0

        c'est donc l'item 0 séléctionner dans la liste des différente formation et pour j
        c'est donc l'item 0 selectionner dans la liste des différent BUT/DUT

        pour conclure si je selectionne i = 0 et j = 0 alors on affiche dans la page qui suit
        le livre indqiuer

        et i et j param de la fonction de type int et elle prend donc en argument les 2 counter_


        la eilleur façon aurait été de faire déjà une boucle for ou while et de stocker les
        images dans un tableau et récupérer l'indice du tableau pour connaitre
        la position de l image indiquer

        mais bon cela reste de l'optimisation



         */

//Condition pour afficher un livre destinée but/dut

        if(i == 0 && j == 0){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
           // ze.putExtra("resId",R.drawable.dut_but_geo);
            ze.putExtra("resId_titre",R.string.titre_but_dut_1);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_1);
            ze.putExtra("resId_edition",R.string.edition_but_dut_1);
            ze.putExtra("resId_date",R.string.date_but_dut_1);
            ze.putExtra("resId_decription",R.string.description_but_dut_1);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_1);
            ze.putExtra("resId_cote",R.string.cote_but_dut_1);
            startActivity(ze);

        }

        if(i == 0 && j == 1){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            //ze.putExtra("resId",R.drawable.dut_but_geo);
            ze.putExtra("resId_titre",R.string.titre_but_dut_2);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_2);
            ze.putExtra("resId_edition",R.string.edition_but_dut_2);
            ze.putExtra("resId_date",R.string.date_but_dut_2);
            ze.putExtra("resId_decription",R.string.description_but_dut_2);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_2);
            ze.putExtra("resId_cote",R.string.cote_but_dut_2);
            startActivity(ze);
        }
        if(i == 0 && j == 2){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_but_dut_3);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_3);
            ze.putExtra("resId_edition",R.string.edition_but_dut_3);
            ze.putExtra("resId_date",R.string.date_but_dut_3);
            ze.putExtra("resId_decription",R.string.description_but_dut_3);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_3);
            ze.putExtra("resId_cote",R.string.cote_but_dut_3);
            startActivity(ze);

        }
        if(i == 0 && j == 3){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_but_dut_4);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_4);
            ze.putExtra("resId_edition",R.string.edition_but_dut_4);
            ze.putExtra("resId_date",R.string.date_but_dut_4);
            ze.putExtra("resId_decription",R.string.description_but_dut_4);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_4);
            ze.putExtra("resId_cote",R.string.cote_but_dut_4);
            startActivity(ze);


        }
        if(i == 0 && j == 4){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_but_dut_5);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_5);
            ze.putExtra("resId_edition",R.string.edition_but_dut_5);
            ze.putExtra("resId_date",R.string.date_but_dut_5);
            ze.putExtra("resId_decription",R.string.description_but_dut_5);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_5);
            ze.putExtra("resId_cote",R.string.cote_but_dut_5);
            startActivity(ze);
        }
        if(i == 0 && j == 5){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_but_dut_6);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_6);
            ze.putExtra("resId_edition",R.string.edition_but_dut_6);
            ze.putExtra("resId_date",R.string.date_but_dut_6);
            ze.putExtra("resId_decription",R.string.description_but_dut_6);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_6);
            ze.putExtra("resId_cote",R.string.cote_but_dut_6);
            startActivity(ze);

        }
        if(i == 0 && j == 6){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_but_dut_7);
            ze.putExtra("resId_auteur",R.string.auteur_but_dut_7);
            ze.putExtra("resId_edition",R.string.edition_but_dut_7);
            ze.putExtra("resId_date",R.string.date_but_dut_7);
            ze.putExtra("resId_decription",R.string.description_but_dut_7);
            ze.putExtra("resId_localisation",R.string.localisation_but_dut_7);
            ze.putExtra("resId_cote",R.string.cote_but_dut_7);
            startActivity(ze);
        }

//Condition pour afficher un livre destinée licence

        if(i == 1 && j == 0){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_1);
            ze.putExtra("resId_auteur",R.string.auteur_lic_1);
            ze.putExtra("resId_edition",R.string.edition_lic_1);
            ze.putExtra("resId_date",R.string.date_lic_1);
            ze.putExtra("resId_decription",R.string.description_lic_1);
            ze.putExtra("resId_localisation",R.string.localisation_lic_1);
            ze.putExtra("resId_cote",R.string.cote_lic_1);
            startActivity(ze);
        }
        if(i == 1 && j == 1){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_2);
            ze.putExtra("resId_auteur",R.string.auteur_lic_2);
            ze.putExtra("resId_edition",R.string.edition_lic_2);
            ze.putExtra("resId_date",R.string.date_lic_2);
            ze.putExtra("resId_decription",R.string.description_lic_2);
            ze.putExtra("resId_localisation",R.string.localisation_lic_2);
            ze.putExtra("resId_cote",R.string.cote_lic_2);
            startActivity(ze);
        }
        if(i == 1 && j == 2){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_3);
            ze.putExtra("resId_auteur",R.string.auteur_lic_3);
            ze.putExtra("resId_edition",R.string.edition_lic_3);
            ze.putExtra("resId_date",R.string.date_lic_3);
            ze.putExtra("resId_decription",R.string.description_lic_3);
            ze.putExtra("resId_localisation",R.string.localisation_lic_3);
            ze.putExtra("resId_cote",R.string.cote_lic_3);
            startActivity(ze);
        }
        if(i == 1 && j == 3){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_4);
            ze.putExtra("resId_auteur",R.string.auteur_lic_4);
            ze.putExtra("resId_edition",R.string.edition_lic_4);
            ze.putExtra("resId_date",R.string.date_lic_4);
            ze.putExtra("resId_decription",R.string.description_lic_4);
            ze.putExtra("resId_localisation",R.string.localisation_lic_4);
            ze.putExtra("resId_cote",R.string.cote_lic_4);
            startActivity(ze);
        }
        if(i == 1 && j == 4){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_5);
            ze.putExtra("resId_auteur",R.string.auteur_lic_5);
            ze.putExtra("resId_edition",R.string.edition_lic_5);
            ze.putExtra("resId_date",R.string.date_lic_5);
            ze.putExtra("resId_decription",R.string.description_lic_5);
            ze.putExtra("resId_localisation",R.string.localisation_lic_5);
            ze.putExtra("resId_cote",R.string.cote_lic_5);
            startActivity(ze);
        }
        if(i == 1 && j == 5){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_6);
            ze.putExtra("resId_auteur",R.string.auteur_lic_6);
            ze.putExtra("resId_edition",R.string.edition_lic_6);
            ze.putExtra("resId_date",R.string.date_lic_6);
            ze.putExtra("resId_decription",R.string.description_lic_6);
            ze.putExtra("resId_localisation",R.string.localisation_lic_6);
            ze.putExtra("resId_cote",R.string.cote_lic_6);
            startActivity(ze);
        }
        if(i == 1 && j == 6){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_7);
            ze.putExtra("resId_auteur",R.string.auteur_lic_7);
            ze.putExtra("resId_edition",R.string.edition_lic_7);
            ze.putExtra("resId_date",R.string.date_lic_7);
            ze.putExtra("resId_decription",R.string.description_lic_7);
            ze.putExtra("resId_localisation",R.string.localisation_lic_7);
            ze.putExtra("resId_cote",R.string.cote_lic_7);
            startActivity(ze);
        }
        if(i == 1 && j == 7){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_8);
            ze.putExtra("resId_auteur",R.string.auteur_lic_8);
            ze.putExtra("resId_edition",R.string.edition_lic_8);
            ze.putExtra("resId_date",R.string.date_lic_8);
            ze.putExtra("resId_decription",R.string.description_lic_8);
            ze.putExtra("resId_localisation",R.string.localisation_lic_8);
            ze.putExtra("resId_cote",R.string.cote_lic_8);
            startActivity(ze);
        }
        if(i == 1 && j == 8){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_9);
            ze.putExtra("resId_auteur",R.string.auteur_lic_9);
            ze.putExtra("resId_edition",R.string.edition_lic_9);
            ze.putExtra("resId_date",R.string.date_lic_9);
            ze.putExtra("resId_decription",R.string.description_lic_9);
            ze.putExtra("resId_localisation",R.string.localisation_lic_9);
            ze.putExtra("resId_cote",R.string.cote_lic_9);
            startActivity(ze);
        }
        if(i == 1 && j == 9){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_10);
            ze.putExtra("resId_auteur",R.string.auteur_lic_10);
            ze.putExtra("resId_edition",R.string.edition_lic_10);
            ze.putExtra("resId_date",R.string.date_lic_10);
            ze.putExtra("resId_decription",R.string.description_lic_10);
            ze.putExtra("resId_localisation",R.string.localisation_lic_10);
            ze.putExtra("resId_cote",R.string.cote_lic_10);
            startActivity(ze);
        }
        if(i == 1 && j == 10){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_11);
            ze.putExtra("resId_auteur",R.string.auteur_lic_11);
            ze.putExtra("resId_edition",R.string.edition_lic_11);
            ze.putExtra("resId_date",R.string.date_lic_11);
            ze.putExtra("resId_decription",R.string.description_lic_11);
            ze.putExtra("resId_localisation",R.string.localisation_lic_11);
            ze.putExtra("resId_cote",R.string.cote_lic_11);
            startActivity(ze);
        }
        if(i == 1 && j == 11){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_12);
            ze.putExtra("resId_auteur",R.string.auteur_lic_12);
            ze.putExtra("resId_edition",R.string.edition_lic_12);
            ze.putExtra("resId_date",R.string.date_lic_12);
            ze.putExtra("resId_decription",R.string.description_lic_12);
            ze.putExtra("resId_localisation",R.string.localisation_lic_12);
            ze.putExtra("resId_cote",R.string.cote_lic_12);
            startActivity(ze);
        }
        if(i == 1 && j == 12){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_13);
            ze.putExtra("resId_auteur",R.string.auteur_lic_13);
            ze.putExtra("resId_edition",R.string.edition_lic_13);
            ze.putExtra("resId_date",R.string.date_lic_13);
            ze.putExtra("resId_decription",R.string.description_lic_13);
            ze.putExtra("resId_localisation",R.string.localisation_lic_13);
            ze.putExtra("resId_cote",R.string.cote_lic_13);
            startActivity(ze);
        }
        if(i == 1 && j == 13){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_14);
            ze.putExtra("resId_auteur",R.string.auteur_lic_14);
            ze.putExtra("resId_edition",R.string.edition_lic_14);
            ze.putExtra("resId_date",R.string.date_lic_14);
            ze.putExtra("resId_decription",R.string.description_lic_14);
            ze.putExtra("resId_localisation",R.string.localisation_lic_14);
            ze.putExtra("resId_cote",R.string.cote_lic_14);
            startActivity(ze);
        }
        if(i == 1 && j == 14){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_15);
            ze.putExtra("resId_auteur",R.string.auteur_lic_15);
            ze.putExtra("resId_edition",R.string.edition_lic_15);
            ze.putExtra("resId_date",R.string.date_lic_15);
            ze.putExtra("resId_decription",R.string.description_lic_15);
            ze.putExtra("resId_localisation",R.string.localisation_lic_15);
            ze.putExtra("resId_cote",R.string.cote_lic_15);
            startActivity(ze);
        }
        if(i == 1 && j == 15){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_16);
            ze.putExtra("resId_auteur",R.string.auteur_lic_16);
            ze.putExtra("resId_edition",R.string.edition_lic_16);
            ze.putExtra("resId_date",R.string.date_lic_16);
            ze.putExtra("resId_decription",R.string.description_lic_16);
            ze.putExtra("resId_localisation",R.string.localisation_lic_16);
            ze.putExtra("resId_cote",R.string.cote_lic_16);
            startActivity(ze);
        }
        if(i == 1 && j == 16){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_17);
            ze.putExtra("resId_auteur",R.string.auteur_lic_17);
            ze.putExtra("resId_edition",R.string.edition_lic_17);
            ze.putExtra("resId_date",R.string.date_lic_17);
            ze.putExtra("resId_decription",R.string.description_lic_17);
            ze.putExtra("resId_localisation",R.string.localisation_lic_17);
            ze.putExtra("resId_cote",R.string.cote_lic_17);
            startActivity(ze);
        }
        if(i == 1 && j == 17){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_18);
            ze.putExtra("resId_auteur",R.string.auteur_lic_18);
            ze.putExtra("resId_edition",R.string.edition_lic_18);
            ze.putExtra("resId_date",R.string.date_lic_18);
            ze.putExtra("resId_decription",R.string.description_lic_18);
            ze.putExtra("resId_localisation",R.string.localisation_lic_18);
            ze.putExtra("resId_cote",R.string.cote_lic_18);
            startActivity(ze);
        }
        if(i == 1 && j == 18){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_19);
            ze.putExtra("resId_auteur",R.string.auteur_lic_19);
            ze.putExtra("resId_edition",R.string.edition_lic_19);
            ze.putExtra("resId_date",R.string.date_lic_19);
            ze.putExtra("resId_decription",R.string.description_lic_19);
            ze.putExtra("resId_localisation",R.string.localisation_lic_19);
            ze.putExtra("resId_cote",R.string.cote_lic_19);
            startActivity(ze);
        }
        if(i == 1 && j == 19){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_20);
            ze.putExtra("resId_auteur",R.string.auteur_lic_20);
            ze.putExtra("resId_edition",R.string.edition_lic_20);
            ze.putExtra("resId_date",R.string.date_lic_20);
            ze.putExtra("resId_decription",R.string.description_lic_20);
            ze.putExtra("resId_localisation",R.string.localisation_lic_20);
            ze.putExtra("resId_cote",R.string.cote_lic_20);
            startActivity(ze);
        }
        if(i == 1 && j == 20){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_21);
            ze.putExtra("resId_auteur",R.string.auteur_lic_21);
            ze.putExtra("resId_edition",R.string.edition_lic_21);
            ze.putExtra("resId_date",R.string.date_lic_21);
            ze.putExtra("resId_decription",R.string.description_lic_21);
            ze.putExtra("resId_localisation",R.string.localisation_lic_21);
            ze.putExtra("resId_cote",R.string.cote_lic_21);
            startActivity(ze);
        }
        if(i == 1 && j == 21){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_22);
            ze.putExtra("resId_auteur",R.string.auteur_lic_22);
            ze.putExtra("resId_edition",R.string.edition_lic_22);
            ze.putExtra("resId_date",R.string.date_lic_22);
            ze.putExtra("resId_decription",R.string.description_lic_22);
            ze.putExtra("resId_localisation",R.string.localisation_lic_22);
            ze.putExtra("resId_cote",R.string.cote_lic_22);
            startActivity(ze);
        }
        if(i == 1 && j == 22){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_23);
            ze.putExtra("resId_auteur",R.string.auteur_lic_23);
            ze.putExtra("resId_edition",R.string.edition_lic_23);
            ze.putExtra("resId_date",R.string.date_lic_23);
            ze.putExtra("resId_decription",R.string.description_lic_23);
            ze.putExtra("resId_localisation",R.string.localisation_lic_23);
            ze.putExtra("resId_cote",R.string.cote_lic_23);
            startActivity(ze);
        }
        if(i == 1 && j == 23){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_24);
            ze.putExtra("resId_auteur",R.string.auteur_lic_24);
            ze.putExtra("resId_edition",R.string.edition_lic_24);
            ze.putExtra("resId_date",R.string.date_lic_24);
            ze.putExtra("resId_decription",R.string.description_lic_24);
            ze.putExtra("resId_localisation",R.string.localisation_lic_24);
            ze.putExtra("resId_cote",R.string.cote_lic_24);
            startActivity(ze);
        }

//Condition pour afficher un livre destinée au licence pro


        if(i == 2 && j == 0){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_1);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_1);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_1);
            ze.putExtra("resId_date",R.string.date_lic_pro_1);
            ze.putExtra("resId_decription",R.string.description_lic_pro_1);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_1);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_1);
            startActivity(ze);
        }
        if(i == 2 && j == 1){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_2);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_2);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_2);
            ze.putExtra("resId_date",R.string.date_lic_pro_2);
            ze.putExtra("resId_decription",R.string.description_lic_pro_2);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_2);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_2);
            startActivity(ze);
        }
        if(i == 2 && j == 2){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_3);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_3);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_3);
            ze.putExtra("resId_date",R.string.date_lic_pro_3);
            ze.putExtra("resId_decription",R.string.description_lic_pro_3);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_3);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_3);
            startActivity(ze);
        }
        if(i == 2 && j == 3){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_4);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_4);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_4);
            ze.putExtra("resId_date",R.string.date_lic_pro_4);
            ze.putExtra("resId_decription",R.string.description_lic_pro_4);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_4);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_4);
            startActivity(ze);
        }
        if(i == 2 && j == 4){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_5);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_5);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_5);
            ze.putExtra("resId_date",R.string.date_lic_pro_5);
            ze.putExtra("resId_decription",R.string.description_lic_pro_5);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_5);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_5);
            startActivity(ze);
        }
        if(i == 2 && j == 5){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_6);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_6);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_6);
            ze.putExtra("resId_date",R.string.date_lic_pro_6);
            ze.putExtra("resId_decription",R.string.description_lic_pro_6);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_6);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_6);
            startActivity(ze);
        }
        if(i == 2 && j == 6){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_7);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_7);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_7);
            ze.putExtra("resId_date",R.string.date_lic_pro_7);
            ze.putExtra("resId_decription",R.string.description_lic_pro_7);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_7);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_7);
            startActivity(ze);
        }
        if(i == 2 && j == 7){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_8);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_8);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_8);
            ze.putExtra("resId_date",R.string.date_lic_pro_8);
            ze.putExtra("resId_decription",R.string.description_lic_pro_8);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_8);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_8);
            startActivity(ze);
        }
        if(i == 2 && j == 8){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_9);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_9);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_9);
            ze.putExtra("resId_date",R.string.date_lic_pro_9);
            ze.putExtra("resId_decription",R.string.description_lic_pro_9);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_9);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_9);
            startActivity(ze);
        }
        if(i == 2 && j == 9){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_lic_pro_10);
            ze.putExtra("resId_auteur",R.string.auteur_lic_pro_10);
            ze.putExtra("resId_edition",R.string.edition_lic_pro_10);
            ze.putExtra("resId_date",R.string.date_lic_pro_10);
            ze.putExtra("resId_decription",R.string.description_lic_pro_10);
            ze.putExtra("resId_localisation",R.string.localisation_lic_pro_10);
            ze.putExtra("resId_cote",R.string.cote_lic_pro_10);
            startActivity(ze);
        }

//Condition pour afficher un livre destinée au master

        if(i == 3 && j == 0){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_1);
            ze.putExtra("resId_auteur",R.string.auteur_master_1);
            ze.putExtra("resId_edition",R.string.edition_master_1);
            ze.putExtra("resId_date",R.string.date_master_1);
            ze.putExtra("resId_decription",R.string.description_master_1);
            ze.putExtra("resId_localisation",R.string.localisation_master_1);
            ze.putExtra("resId_cote",R.string.cote_master_1);
            startActivity(ze);
        }
        if(i == 3 && j == 1){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_2);
            ze.putExtra("resId_auteur",R.string.auteur_master_2);
            ze.putExtra("resId_edition",R.string.edition_master_2);
            ze.putExtra("resId_date",R.string.date_master_2);
            ze.putExtra("resId_decription",R.string.description_master_2);
            ze.putExtra("resId_localisation",R.string.localisation_master_2);
            ze.putExtra("resId_cote",R.string.cote_master_2);
            startActivity(ze);
        }
        if(i == 3 && j == 2){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_3);
            ze.putExtra("resId_auteur",R.string.auteur_master_3);
            ze.putExtra("resId_edition",R.string.edition_master_3);
            ze.putExtra("resId_date",R.string.date_master_3);
            ze.putExtra("resId_decription",R.string.description_master_3);
            ze.putExtra("resId_localisation",R.string.localisation_master_3);
            ze.putExtra("resId_cote",R.string.cote_master_3);
            startActivity(ze);
        }
        if(i == 3 && j == 3){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_4);
            ze.putExtra("resId_auteur",R.string.auteur_master_4);
            ze.putExtra("resId_edition",R.string.edition_master_4);
            ze.putExtra("resId_date",R.string.date_master_4);
            ze.putExtra("resId_decription",R.string.description_master_4);
            ze.putExtra("resId_localisation",R.string.localisation_master_4);
            ze.putExtra("resId_cote",R.string.cote_master_4);
            startActivity(ze);
        }
        if(i == 3 && j == 4){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_5);
            ze.putExtra("resId_auteur",R.string.auteur_master_5);
            ze.putExtra("resId_edition",R.string.edition_master_5);
            ze.putExtra("resId_date",R.string.date_master_5);
            ze.putExtra("resId_decription",R.string.description_master_5);
            ze.putExtra("resId_localisation",R.string.localisation_master_5);
            ze.putExtra("resId_cote",R.string.cote_master_5);
            startActivity(ze);
        }

//Condition pour afficher un livre destinée au master meef

        if(i == 4 && j == 0){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_1);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_1);
            ze.putExtra("resId_edition",R.string.edition_master_meef_1);
            ze.putExtra("resId_date",R.string.date_master_meef_1);
            ze.putExtra("resId_decription",R.string.description_master_meef_1);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_1);
            ze.putExtra("resId_cote",R.string.cote_master_meef_1);
            startActivity(ze);
        }
        if(i == 4 && j == 1){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_2);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_2);
            ze.putExtra("resId_edition",R.string.edition_master_meef_2);
            ze.putExtra("resId_date",R.string.date_master_meef_2);
            ze.putExtra("resId_decription",R.string.description_master_meef_2);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_2);
            ze.putExtra("resId_cote",R.string.cote_master_meef_2);
            startActivity(ze);
        }
        if(i == 4 && j == 2){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_3);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_3);
            ze.putExtra("resId_edition",R.string.edition_master_meef_3);
            ze.putExtra("resId_date",R.string.date_master_meef_3);
            ze.putExtra("resId_decription",R.string.description_master_meef_3);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_3);
            ze.putExtra("resId_cote",R.string.cote_master_meef_3);
            startActivity(ze);
        }
        if(i == 4 && j == 3){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_4);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_4);
            ze.putExtra("resId_edition",R.string.edition_master_meef_4);
            ze.putExtra("resId_date",R.string.date_master_meef_meef_4);
            ze.putExtra("resId_decription",R.string.description_master_meef_4);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_4);
            ze.putExtra("resId_cote",R.string.cote_master_meef_4);
            startActivity(ze);
        }
        if(i == 4 && j == 4){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_5);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_5);
            ze.putExtra("resId_edition",R.string.edition_master_meef_5);
            ze.putExtra("resId_date",R.string.date_master_meef_5);
            ze.putExtra("resId_decription",R.string.description_master_meef_5);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_5);
            ze.putExtra("resId_cote",R.string.cote_master_meef_5);
            startActivity(ze);
        }
        if(i == 4 && j == 5){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_6);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_6);
            ze.putExtra("resId_edition",R.string.edition_master_meef_6);
            ze.putExtra("resId_date",R.string.date_master_meef_6);
            ze.putExtra("resId_decription",R.string.description_master_meef_6);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_6);
            ze.putExtra("resId_cote",R.string.cote_master_meef_6);
            startActivity(ze);
        }
        if(i == 4 && j == 6){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_7);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_7);
            ze.putExtra("resId_edition",R.string.edition_master_meef_7);
            ze.putExtra("resId_date",R.string.date_master_meef_meef_7);
            ze.putExtra("resId_decription",R.string.description_master_meef_7);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_7);
            ze.putExtra("resId_cote",R.string.cote_master_meef_7);
            startActivity(ze);
        }
        if(i == 4 && j == 7){
            System.out.println(i);
            System.out.println(j);
            Intent ze = new Intent(Conseiller_SpinnerActivity.this,Livre_a_conseillerActivity.class);
            ze.putExtra("resId_titre",R.string.titre_master_meef_8);
            ze.putExtra("resId_auteur",R.string.auteur_master_meef_8);
            ze.putExtra("resId_edition",R.string.edition_master_meef_8);
            ze.putExtra("resId_date",R.string.date_master_meef_8);
            ze.putExtra("resId_decription",R.string.description_master_meef_8);
            ze.putExtra("resId_localisation",R.string.localisation_master_meef_8);
            ze.putExtra("resId_cote",R.string.cote_master_meef_8);
            startActivity(ze);
        }
    }
}