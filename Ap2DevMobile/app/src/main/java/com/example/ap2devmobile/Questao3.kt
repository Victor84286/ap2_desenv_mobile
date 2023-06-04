package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questao3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questao3)

        val botaoPesada: Button = findViewById(R.id.botaoPesada)
        botaoPesada.setOnClickListener {
            Dados.armadura = 3
            val intent = Intent(this, Questao4::class.java)
            startActivity(intent)
        }

        val botaoMedia: Button = findViewById(R.id.botaoMedia)
        botaoMedia.setOnClickListener {
            Dados.armadura = 2
            val intent = Intent(this, Questao4::class.java)
            startActivity(intent)
        }

        val botaoLeve: Button = findViewById(R.id.botaoLeve)
        botaoLeve.setOnClickListener {
            Dados.armadura = 1
            val intent = Intent(this, Questao4::class.java)
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