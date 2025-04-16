package com.victormarchidev.jokenpo_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        verificarGanhador("Pedra");
    }

    public void selecionarPapel(View view){
        verificarGanhador("Papel");
    }

    public void selecionarTesoura(View view){
        verificarGanhador("Tesoura");
    }

    private String gerarEscolhaAleatoria() {
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int numeroAleatorio = new Random().nextInt(3);

        ImageView imagemApp = findViewById(R.id.image_app);

        String escolhaApp = opcoes[numeroAleatorio];
        switch (escolhaApp){
            case "Pedra":
                imagemApp.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;
        }
        return escolhaApp;
    }

    private void verificarGanhador(String escolhaUsuario){

        String escolhaApp = gerarEscolhaAleatoria();
        TextView textoResultado = findViewById(R.id.text_resultado);

        if (
            (escolhaApp == "Pedra" && escolhaUsuario == "Tesoura") ||
            (escolhaApp == "Papel" && escolhaUsuario == "Pedra") ||
            (escolhaApp == "Tesoura" && escolhaUsuario == "Papel")
        ){
            textoResultado.setText("Voce perdeu :(");
        } else if(
            (escolhaUsuario == "Pedra" && escolhaApp == "Tesoura") ||
            (escolhaUsuario == "Papel" && escolhaApp == "Pedra") ||
            (escolhaUsuario == "Tesoura" && escolhaApp == "Papel")
        ){
            textoResultado.setText("Voce ganhou :)");
        } else {
            textoResultado.setText("Empatamos :(");
        }

        //System.out.println("item clicado: " + escolhaUsuario);
    }


}