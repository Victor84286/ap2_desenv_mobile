package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questao4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questao4)

        val botaoAtacante: Button = findViewById(R.id.botaoAtacante)
        botaoAtacante.setOnClickListener {
            Dados.comportamento = 1
            val intent = Intent(this, Resposta::class.java)
            startActivity(intent)
        }

        val botaoSuporte: Button = findViewById(R.id.botaoSuporte)
        botaoSuporte.setOnClickListener {
            Dados.comportamento = 2
            val intent = Intent(this, Resposta::class.java)
            startActivity(intent)
        }

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.BotaoVoltar, FragmentVoltaMain())
                .commit()
        }

        val botaoMain: Button = findViewById(R.id.botaoMain)
        botaoMain.setOnClickListener {
            Dados.resistencia = 3
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}