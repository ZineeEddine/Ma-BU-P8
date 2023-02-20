package com.appmbp.mbp8;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.appmbp.mbp8.databinding.ActivityMainBinding;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    //Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
       /* binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mn_conseiller,R.id.sl_bleue,R.id.sl_brune,R.id.sl_orange,R.id.sl_rose,R.id.sl_rouge,R.id.sl_verte,R.id.sl_violette,R.id.sl_jaune,R.id.sl_noire,R.id.ac_horaire,R.id.ac_règle)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true ;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){

            case R.id.action_propos:
            Toast.makeText(getApplicationContext(),"À propos de l'application",Toast.LENGTH_SHORT).show();
            openActivity_apropos();
            return true;

            case R.id.action_note:
              //  System.out.println("test note");
                Intent cl = new Intent(Intent.ACTION_VIEW);
                Uri dt = Uri.parse("https://play.google.com/store/apps/details?id=com.appmbp.mbp8&hl=fr&gl=US");
                cl.setData(dt);
                startActivity(Intent.createChooser(cl,"App"));
                return true;

           /* case R.id.action_share:
                System.out.println("test share");
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Ma BU P8 - Application mobile ");
                intent.setType("txt/plain");
                String url_app = "https://play.google.com/store/apps/details?id=com.appmbp.mbp8&hl=fr&gl=US";
                intent.putExtra(Intent.EXTRA_TEXT,url_app);
                startActivity(Intent.createChooser(intent,"share via"));
                return true;*/

            case R.id.action_share:
            //    System.out.println("test share");
                Toast.makeText(getApplicationContext(),"En cas d'erreur de partage, veuillez partager l'application depuis Google Play Store",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("txt/plain");
              //  String Body= "Télécharge l'application";
                String url_app = " 'Ma BU P8' --> Télécharge l'application mobile depuis le lien : https://play.google.com/store/apps/details?id=com.appmbp.mbp8&hl=fr&gl=US";
               // intent.putExtra(Intent.EXTRA_TEXT,Body);
                intent.putExtra(Intent.EXTRA_TEXT,url_app);
                startActivity(Intent.createChooser(intent,"Partager via"));
                return true;

        }
            return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void openActivity_apropos(){
        Intent intent= new Intent(this, com.appmbp.mbp8.A_ProposActivity.class);
        startActivity(intent);
    }






}






