package com.example.meuapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(32, 48, 32, 32)
        }

        val titulo = TextView(this).apply {
            text = "Boas-vindas"
            textSize = 24f
        }

        val nome = EditText(this).apply {
            hint = "Digite seu nome"
        }

        val botao = Button(this).apply {
            text = "Mostrar nome"
        }

        val resposta = TextView(this).apply {
            textSize = 18f
        }

        botao.setOnClickListener {
            resposta.text = "Olá. ${nome.text.toString().trim()}!"
        }

        layout.addView(titulo)
        layout.addView(nome)
        layout.addView(botao)
        layout.addView(resposta)
        setContentView(layout)
    }
}
