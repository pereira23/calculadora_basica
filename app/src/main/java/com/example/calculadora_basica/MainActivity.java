package com.example.calculadora_basica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button sumar, resta, multi, div;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);

        sumar= findViewById(R.id.suma);
        resta= findViewById(R.id.resta);
        multi= findViewById(R.id.multi);
        div= findViewById(R.id.div);

        resultado= findViewById(R.id.resultado);

        sumar.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1= Integer.parseInt(n1);
        int entero2= Integer.parseInt(n2);
        int rta=0;

        switch (view.getId()){
            case R.id.suma:
                rta=entero1+entero2;
                break;
            case R.id.resta:
                rta=entero1-entero2;
                break;
            case R.id.multi:
                rta=entero1*entero2;
                break;
            case R.id.div:
                rta=entero1/entero2;
                break;
        }
        resultado.setText(""+rta);
    }
}
