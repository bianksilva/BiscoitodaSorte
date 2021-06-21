package br.com.biancasilva.biscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_identifica.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //tentando criar uma lista
    val listaFrases = arrayOf("A vida é como diria Avril Lavigne: Complicated.",
        "Acredite na sua capacidade de estragar tudo!","Sei lá meu bem, fé!","Calma, ainda pode piorar!",
        "Sério que você espera algo bom ainda?","Você vai estragar esse botão.","Sorte do dia? Se toca!",
        "Tá na mão de Deus, por que na tua é prejuízo.", "Tá na mão de Deus, as minhas já lavei.", "Tá bom, chega! Cansei.","kkkk amore cê não cansa?!")
        val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //escutando o clique do botão
        btnNova.setOnClickListener {
            //escolher uma nova frase
            val index = random.nextInt(11)
          edtTexto.text = listaFrases[index]



        }




    }
}