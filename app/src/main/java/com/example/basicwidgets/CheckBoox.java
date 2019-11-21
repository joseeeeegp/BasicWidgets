package com.example.basicwidgets;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class CheckBoox extends AppCompatActivity  {
    CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        check = (CheckBox) findViewById(R.id.check);
        check.setText("this checkbox is: unchecked");
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked()){
                    check.setText("This checkbox is: checked");
                }else{
                    check.setText("This checkbox is: unchecked");
                }
            }
        });
    }
}