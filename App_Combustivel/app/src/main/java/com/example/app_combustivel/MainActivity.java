package com.example.app_combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResult = findViewById(R.id.textResult);

    }
    public void calcularPreco(View view){
        Double alcool = Double.parseDouble( editPrecoAlcool.getText().toString() );
        Double gasolina = Double.parseDouble( editPrecoGasolina.getText().toString() );
        Double resultado = (alcool/gasolina);

        /* faz calculo (alcool/gasolina)
            if (resultado >= 0.7) é melhor usar gasolina
            else melhor utilizar alcool
         */

        if (resultado >= 0.7){
            textResult.setText("Melhor utilizar Gasolina!!");
        }else{
            textResult.setText("Melhor utilizar Álcool!! ");
        }



    }





}