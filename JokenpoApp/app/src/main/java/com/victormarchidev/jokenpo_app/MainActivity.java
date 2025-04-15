package com.victormarchidev.jokenpo_app;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

    private void verificarGanhador(String escolhaUsuario){
        System.out.println("item clicado: " + escolhaUsuario);
    }
}