package com.example.ap2devmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Resposta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resposta)

        var textResp:String = ""

        var textDesc:String = ""

        val imagemResposta:ImageView = findViewById(R.id.imageResposta)

        if(Dados.resistencia == 3 && Dados.ataque == 1 && Dados.armadura == 3 && Dados.comportamento == 1){
            val img = R.drawable.guerreiro
            imagemResposta.setImageResource(img)
            imagemResposta.height
            textResp = "Guerreiro ou cavaleiro"
            textDesc = "Tal classe é a principal responsável por desempenhar o papel de tank devido à alta resistência. Além disso, é possível notar que nos mais diversos jogos elas são as únicas classes capazes de equipar escudos."
        }

        else if(Dados.resistencia == 1 && Dados.ataque == 2 && Dados.armadura == 2 && Dados.comportamento == 1){
            val img = R.drawable.arqueiro
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Arqueiro, Caçador ou Ranger"
            textDesc = "Arqueiros, Caçadores e Rangers são conhecidos pelo combate à distância, uma vez que atacam de longe. Normalmente são personagens populares por serem fáceis de se jogar e possuírem muitas ferramentas. Também são opções muito seguras e frequentemente estão entre os melhores DPS do jogo."
        }

        else if(Dados.resistencia == 1 && Dados.ataque == 3 && Dados.armadura == 1 && Dados.comportamento == 1){
            val img = R.drawable.mago
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Mago, Bruxo ou Elementalista"
            textDesc = "Magos, Bruxos ou Elementalistas são capazes de controlar os elementos para usá-los de forma ofensiva ou defensiva. Sobretudo, eles sempre atacam de longe e evitam estar perto do perigo. Costumam ser indispensáveis em grupos, mas também possuem dependência por outras classes que aguentem o tranco. "
        }

        else if(Dados.resistencia == 1 && Dados.ataque == 1 && Dados.armadura == 2 && Dados.comportamento == 1){
            val img = R.drawable.assassino
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Assassino, Ladino, Ladrão ou Ninja"
            textDesc = "Assassinos, Ladinos, Ladrões e Ninjas são classes com habilidades exclusivas de furtividade e geralmente causam dano absurdo e instantâneo. Apesar de não possuírem grande resistência, seu foco principal é não dar chance para os oponentes atacarem."
        }

        else if(Dados.resistencia == 3 && Dados.ataque == 4 && Dados.armadura == 1 && Dados.comportamento == 2){
            val img = R.drawable.curandeiro
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Clérigo, Sacerdote ou Curandeiro"
            textDesc = "Clérigos, Sacerdotes e Curandeiros são as classes de suporte cujas habilidades são voltadas para o grupo como curas, buffs, expurgos de debuffs e ressurreições. Elas até possuem boas ferramentas para uparem sozinhas, mas o caminho mais rápido até o nível máximo é pela experiência compartilhada em grupos."
        }

        else if(Dados.resistencia == 3 && Dados.ataque == 4 && Dados.armadura == 3 && Dados.comportamento == 1){
            val img = R.drawable.paladino
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Paladino ou Templário"
            textDesc = "Paladinos e Templários combinam o uso de magias, buffs, curas e outras habilidades de suporte. Seu foco principal é a capacidade de tankar resultante da alta resistência e das habilidades de cura. Também podem oferecer tipos de suporte diferentes de Sacerdotes."
        }

        else if(Dados.resistencia == 1 && Dados.ataque == 3 && Dados.armadura == 1 && Dados.comportamento == 1){
            val img = R.drawable.invocador
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Feiticeiro, Invocador ou Necromante"
            textDesc = "Feiticeiros, Invocadores ou Necromantes são variações de Magos e Bruxos que costumam usar magias sombrias ou de sangue em vez de controlar elementos. Suas habilidades podem envolver roubos de vida ou mana, invocações de minions, transformação em demônios, poderosos debuffs ou maldições que causam dano com o tempo."
        }

        else if(Dados.resistencia == 2 && Dados.ataque == 4 && Dados.armadura == 2 && Dados.comportamento == 1){
            val img = R.drawable.druida
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Druida ou Xamã"
            textDesc = "Druidas e Xamãs são seres que vivem em harmonia com a natureza, sempre reunindo sua energia para utilizar de forma ofensiva, defensiva ou de suporte. Seu principal diferencial é a capacidade de se transformar em diferentes animais para utilizar seus pontos fortes como resistência, movimentação rápida ou capacidade de dano."
        }

        else if(Dados.resistencia == 1 && Dados.ataque == 2 && Dados.armadura == 2 && Dados.comportamento == 2){
            val img = R.drawable.bardo
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Bardo ou Dançarina"
            textDesc = "Bardos e Dançarinas combinam ataques de longa distância com magias. Apesar de causarem dano respeitável, seu foco principal costuma ser nos efeitos únicos das suas músicas e danças."
        }

        else if(Dados.resistencia == 2 && Dados.ataque == 1 && Dados.armadura == 1 && Dados.comportamento == 1){
            val img = R.drawable.monge
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Monge ou Lutador"
            textDesc = "Monges e Lutadores misturam combate corporal com o uso de magias. A principal fonte do seu dano são ataques físicos, enquanto as magias são acessórias e situacionais. Às vezes podem atacar de longe através de energia psíquica, mas seu foco principal é sempre corpo a corpo."
        }

        else if(Dados.resistencia == 2 && Dados.ataque == 1 && Dados.armadura == 3 && Dados.comportamento == 1){
            val img = R.drawable.barbaro
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Bárbaro ou Berserker"
            textDesc = "Bárbaros e Berserkers são semelhantes aos Guerreiros, mas costumam ter foco exclusivo no aspecto ofensivo. Lutam em distâncias corporais e podem usar os mesmos equipamentos, porém, possuem menos recursos defensivos."
        }

        else {
            val img = R.drawable.humano
            imagemResposta.setImageResource(img)
            imagemResposta.setPadding(0, 0, 0, 0)
            textResp = "Humano"
            textDesc = "Humanos são capazes de fazerem qualquer coisa, sendo a classe mais versátil e que pode ser especializada para qualquer outra."
        }



        val textoResposta:TextView = findViewById(R.id.Resposta)
        textoResposta.text = "A sua classe é $textResp"


        val textoRespostaDesc:TextView = findViewById(R.id.RespostaDesc)
        textoRespostaDesc.text = "$textDesc"
        textoRespostaDesc.movementMethod = ScrollingMovementMethod()



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