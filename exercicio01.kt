package com.example.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mensagem = TextView(this)
        mensagem.text = "Olá, Mobile!"
        mensagem.textSize = 24f

        setContentView(mensagem)
    }
}