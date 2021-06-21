package br.com.biancasilva.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    //é um dos métodos presentes no ciclo de vida da Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Abrir a MainActivity após 5 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //iniciar uma intent - transição da tela Splash para a tela Main
            val mIntent = Intent(this, IdentificaActivity::class.java)
            startActivity(mIntent)
            //matando a splash
            finish()
        }, 3000)
    }
}