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
    
        val valor = EditText(this).apply {
            hint = "Digite uma tarefa"
        }

        val botao = Button(this).apply {
            text = "Adicionar"
        }
        
        val resposta = TextView(this).apply {
            text = "Nenhuma tarefa adicionada."
            textSize = 18f
        }
    
        botao.setOnClickListener {
            val tarefa = valor.text.toString().trim()

            resposta.text = if (tarefa.isEmpty()) {
                "Digite uma tarefa antes de adicionar."
            } else {
                "Tarefa adicionada: $tarefa"
            } 
        }

        layout.addView(valor)
        layout.addView(botao)
        layout.addView(resposta)
        setContentView(layout)
    }
}
