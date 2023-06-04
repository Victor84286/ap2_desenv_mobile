package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questao2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questao2)

        val botaoCorporal: Button = findViewById(R.id.botaoCorporal)
        botaoCorporal.setOnClickListener {
            Dados.ataque = 1
            val intent = Intent(this, Questao3::class.java)
            startActivity(intent)
        }

        val botaoArco: Button = findViewById(R.id.botaoArco)
        botaoArco.setOnClickListener {
            Dados.ataque = 2
            val intent = Intent(this, Questao3::class.java)
            startActivity(intent)
        }

        val botaoMagia: Button = findViewById(R.id.botaoMagia)
        botaoMagia.setOnClickListener {
            Dados.ataque = 3
            val intent = Intent(this, Questao3::class.java)
            startActivity(intent)
        }

        val botaoCorporalMagia: Button = findViewById(R.id.botaoCorporalMagia)
        botaoCorporalMagia.setOnClickListener {
            Dados.ataque = 4
            val intent = Intent(this, Questao3::class.java)
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