package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questao1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questao1)

        val botaoBaixa: Button = findViewById(R.id.botaoBaixa)
        botaoBaixa.setOnClickListener {
            Dados.resistencia = 1
            val intent = Intent(this, Questao2::class.java)
            startActivity(intent)
        }

        val botaoMedia: Button = findViewById(R.id.botaoMedia)
        botaoMedia.setOnClickListener {
            Dados.resistencia = 2
            val intent = Intent(this, Questao2::class.java)
            startActivity(intent)
        }

        val botaoAlta: Button = findViewById(R.id.botaoAlta)
        botaoAlta.setOnClickListener {
            Dados.resistencia = 3
            val intent = Intent(this, Questao2::class.java)
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