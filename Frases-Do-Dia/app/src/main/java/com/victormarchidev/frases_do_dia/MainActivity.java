package com.victormarchidev.frases_do_dia;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
      "Acredite em si mesmo e você será imparável",
      "A persistência é o caminho do êxito",
      "O sucesso é a soma de pequenos esforços repetidos dia após dia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);
    }

    public void exibirTodas(View view){

        TextView resultado = findViewById(R.id.textResultado);
        String textoResultado = "";

        for(String frase : frases){
            textoResultado = textoResultado + frase + "\n";
        }

        resultado.setText(textoResultado);
    }

}