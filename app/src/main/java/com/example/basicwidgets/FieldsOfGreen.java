package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class FieldsOfGreen extends AppCompatActivity implements View.OnClickListener{
    EditText e;
    TextView f;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields_of_green);
        e = (EditText) findViewById(R.id.TextoE);
        e.setText("Hello");
        f = (TextView) findViewById(R.id.TextoF);
        f.setText("Hello");
        boton = (Button) findViewById(R.id.reinicio);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        e.setText("Hello");
    }
}