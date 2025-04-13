package com.example.primeiroapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    //Função para sortear um número e atribui-lo ao textView

    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = java.util.Random().nextInt(11)
        textoResultado.setText("número gerado: $numero")
    }


}