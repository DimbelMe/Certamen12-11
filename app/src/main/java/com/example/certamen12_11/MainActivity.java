          package com.example.certamen12_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView imc, rango;
    EditText peso, estatura, instrucciones;
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
        instrucciones = findViewById(R.id.txtInst);
        rango = findViewById(R.id.txtRango);

    }

    public void CalcularIMC(View view){
        String pesocomp = peso.getText().toString();
        String estaturacomp = estatura.getText().toString();

        if(pesocomp.isEmpty() || estaturacomp.isEmpty()){
            Toast.makeText(this, "Error! No pueden haber campos vacios", Toast.LENGTH_SHORT).show();
        }else{
            Double pesoIMC = Double.parseDouble(peso.getText().toString());
            Double estaturaIMC = Double.parseDouble(estatura.getText().toString())/100;

            Double calculo = (pesoIMC / (estaturaIMC * estaturaIMC));
            imc.setText("IMC: " + calculo);
            if(calculo <= 18.5){
                rango.setText("Usted está bajo peso");
                instrucciones.setText("1) come con mas frecuencia. Empieza poco a poco" +
                        " a hacer 5 a 6 comidas mas pequeñas durante el dia" +
                        "\n 2) Elige alimentos con muchos nutrientes" +
                        "\n 3) Agrega aderezos" +
                        "\n 4) Prueba licuados y batidos de frutas" +
                        "\n 5) Controla que bebes y cuando" +
                        "\n 6) Haz ejercicio");
            }else if(calculo >= 18.5 && calculo <= 24.9){
                rango.setText("Felicitaciones ud mantiene una excelente alimentación");
                instrucciones.setText("");
            }else if(calculo >= 25){
                rango.setText("Usted está sobre peso");
                instrucciones.setText("1 )Haga 30 minutos de ejercicio aerobico 5 veces por semana" +
                        "\n 2) Logre un equilibrio entre el consumo de calorias y la actividad fisica" +
                        "\n 3) Limite las grasas saturadas a no mas del 7% de la caloritas totales" +
                        "\n 4) Tenga una alimentacion baja en colesterlos con carnes magras, frutas, verduras y cereales integrales");
            }
        }
    }
}