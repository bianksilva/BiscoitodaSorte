package br.com.biancasilva.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_boasorte.*
import kotlinx.android.synthetic.main.activity_identifica.*

class BoasorteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boasorte)


        //Abrir a MainActivity após 5 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //iniciar uma intent - transição da tela Splash para a tela Main
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            //matando a splash
            finish()
        }, 3000)
    }
}