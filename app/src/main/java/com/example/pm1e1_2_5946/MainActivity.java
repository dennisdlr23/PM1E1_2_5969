package com.example.pm1e1_2_5946;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtN;
    private TextView txtA;
    private TextView txtE;
    private TextView txtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombres = (EditText) findViewById(R.id.txtnombres);
        EditText apellidos = (EditText) findViewById(R.id.txtapellidos);
        EditText edad = (EditText) findViewById(R.id.txtedad);
        EditText correo = (EditText) findViewById(R.id.txtcorreo);

        Button enviar = (Button) findViewById(R.id.btnEnviar);
        txtN = (TextView) findViewById(R.id.txtN);
        txtA = (TextView) findViewById(R.id.txtA);
        txtE = (TextView) findViewById(R.id.txtE);
        txtC = (TextView) findViewById(R.id.txtC);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), ActivityResultado.class);
            String nombre = nombres.getText().toString();
            String apellido = apellidos.getText().toString();
            String eda = edad.getText().toString();
            String corre = correo.getText().toString();

            txtN.setText("" + nombre);
            txtA.setText("" + apellido);
            txtE.setText("" + eda);
            txtC.setText("" + corre);

                pantalla.putExtra("daton", txtN.getText().toString());
                pantalla.putExtra("datoa", txtA.getText().toString());
                pantalla.putExtra("datoe", txtE.getText().toString());
                pantalla.putExtra("datoc", txtC.getText().toString());
                startActivity(pantalla);
            }
        });
    }
}