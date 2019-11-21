package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu8);


    }

    public void RadiooGoups (View v){
        startActivity(new Intent(this,RadioGoups.class));
    }
    public void Buuttoons (View v){
        startActivity(new Intent(this,Buttons.class));
    }
    public void URLDEMOO (View v){
        startActivity(new Intent(this,URLDEMO.class));
    }
    public void OOVERLAP (View v){
        startActivity(new Intent(this,OVERLAP.class));
    }
    public void SCROOLVIEW (View v){
        startActivity(new Intent(this,SCROLLVIE.class));
    }

}
