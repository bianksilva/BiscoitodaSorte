package br.com.biancasilva.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_boasorte.*
import kotlinx.android.synthetic.main.activity_identifica.*
import kotlinx.android.synthetic.main.activity_main.*


class IdentificaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identifica)

        //executando o clique do botão próximo
        btnGerar.setOnClickListener {
            val mIntent = Intent(this, BoasorteActivity::class.java)
            startActivity(mIntent)

        }
    }
}