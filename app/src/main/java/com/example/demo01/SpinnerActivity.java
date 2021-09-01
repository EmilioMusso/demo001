package com.example.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    final String[] spinnerOpciones = {"Opt1", "Opt2", "Opt3", "Opt4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        ArrayAdapter<CharSequence> adaptador = new ArrayAdapter(
                this,
                R.layout.support_simple_spinner_dropdown_item, // este es el layout
                spinnerOpciones);

        Spinner spinner = findViewById(R.id.spinner_opt);
        spinner.setAdapter(adaptador);

        //TODO levantar valores de /resources
    }
}