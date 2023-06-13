package com.example.ap2devmobile

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.button)
        botao.setOnClickListener {
            val intent = Intent(this, Questao1::class.java)
            startActivity(intent)
        }

        val botaoGithub: ImageButton = findViewById(R.id.btnImage)
        botaoGithub.setOnClickListener {
            val query = "https://br.linkedin.com/in/victor-hugo-rocha/en?trk=people-guest_people_search-card"
            val searchIntent = Intent(Intent.ACTION_WEB_SEARCH)
            searchIntent.putExtra(SearchManager.QUERY, query)
            startActivity(searchIntent)
        }
    }

    fun showNoteDetail(selectedNote: String) {

    }
}