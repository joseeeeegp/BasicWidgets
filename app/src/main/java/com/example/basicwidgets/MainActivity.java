package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Assing_labelss(View v){
        startActivity(new Intent(this,Assinging_labels.class));
    }
    public void button_who_s_got_the_buttonn (View v){
        startActivity(new Intent(this,button_who_s_got_the_button.class));
    }
    public void Fleeting_imagees (View v){
        startActivity(new Intent(this,Fleeting_images.class));
    }

    public void FliedsOfGreeen(View v){
        startActivity(new Intent(this,FieldsOfGreen.class));
    }

    public void CheckBooox (View v){
        startActivity(new Intent(this,CheckBoox.class));
    }
    public void Raadio_Up (View v){
        startActivity(new Intent(this,Radio_Up.class));
    }
    public void Sonidoo4 (View v){
        startActivity(new Intent (this,Sonido4.class));
    }
}
