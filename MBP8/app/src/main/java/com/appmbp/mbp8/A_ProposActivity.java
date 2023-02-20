package com.appmbp.mbp8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class A_ProposActivity extends AppCompatActivity {
    ImageView img;
    Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        img = findViewById(R.id.image_aprop);
        drawable=getResources().getDrawable(R.mipmap.ic_launcher_round);
        img.setImageDrawable(drawable);



    }
}