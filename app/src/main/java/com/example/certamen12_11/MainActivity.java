          package com.example.certamen12_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText peso, estatura, imc;
    Spinner spinner;

    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.Spinner);
        peso = findViewById(R.id.txtPeso);
        estatura = findViewById(R.id.txtAltura);
        imc = findViewById(R.id.txtIMC);

    }

}