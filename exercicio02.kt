package com.example.meuapp

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val informacoes = """
        Fabricante: ${Build.MANUFACTURER}
        Modelo: ${Build.MODEL}
        Android: ${Build.VERSION.RELEASE}
        SDK: ${Build.VERSION.SDK_INT}
    """.trimIndent()  

    val texto = TextView(this)  
    texto.text = informacoes
    texto.textSize = 18f
    texto.setPadding(32, 32, 32, 32)

    setContentView(texto)
    }
}
