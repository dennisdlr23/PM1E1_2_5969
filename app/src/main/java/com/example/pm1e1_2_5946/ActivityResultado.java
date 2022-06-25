package com.example.pm1e1_2_5946;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    private TextView txtnom, txtape, txted, txtcor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtnom = (TextView) findViewById(R.id.txtnom);
        txtape = (TextView) findViewById(R.id.txtape);
        txted = (TextView) findViewById(R.id.txted);
        txtcor = (TextView) findViewById(R.id.txtcor);

        String daton = getIntent().getStringExtra("daton");
        String datoa = getIntent().getStringExtra("datoa");
        String datoe = getIntent().getStringExtra("datoe");
        String datoc = getIntent().getStringExtra("datoc");
        txtnom.setText(""+ daton);
        txtape.setText(""+ datoa);
        txted.setText(""+ datoe);
        txtcor.setText(""+ datoc);

        Button atras = (Button) findViewById(R.id.btnatras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantalla);
            }
        });
    }
}