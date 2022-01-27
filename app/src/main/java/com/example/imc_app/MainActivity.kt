package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "CREATE - Estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "STAR - Deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "RESUME - Agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - A tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "STOP - A tela não está mais visivel mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "\nRESTART - A tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "\nDESTROY - oh não! a tela foi destruida")
    }


}