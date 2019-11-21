package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class Radio_Up extends AppCompatActivity {
RadioButton verde;
RadioButton rojo;
RadioButton azul;
TextView frase;


@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields_of_green);
        verde=(RadioButton)findViewById(R.id.radio1);
        azul=(RadioButton)findViewById(R.id.radio2);
        rojo=(RadioButton)findViewById(R.id.radio3);

        frase=(TextView) findViewById(R.id.textView4);

        rojo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                frase.setBackgroundColor(Color.RED);
            }
        });

    azul.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            frase.setBackgroundColor(Color.BLUE);
        }
    });

    verde.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            frase.setBackgroundColor(Color.GREEN);
        }
    });
        
    }

   



}
