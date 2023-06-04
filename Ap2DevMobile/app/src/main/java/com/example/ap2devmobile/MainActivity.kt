package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.button)
        botao.setOnClickListener {
            val intent = Intent(this, Questao1::class.java)
            startActivity(intent)
        }
    }

    fun showNoteDetail(selectedNote: String) {

    }
}