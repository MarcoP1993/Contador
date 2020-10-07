package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView texto_numero = null;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto_numero = findViewById(R.id.texto_numero);
        contador = 0;
    }

    public void incrementarContador(View view) {
        contador++; //esto es un comentario
        if (contador == 100){
            texto_numero.setTextSize(150);
            Toast.makeText(this, "Llevas 100", Toast.LENGTH_SHORT).show();
        }
        String nuevoNumero = String.valueOf(contador);
        texto_numero.setText(nuevoNumero);
    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this,"Hola a todos",Toast.LENGTH_SHORT).show();
    }
}