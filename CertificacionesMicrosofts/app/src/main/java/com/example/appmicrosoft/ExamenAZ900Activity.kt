package com.example.appmicrosoft

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ExamenAZ900Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examen_az900)


    }



    //VARIABLES
    val txt_numeroPregunta = findViewById<TextView>(R.id.txt_numeroPregunta)
    val txt_preguntaActual = findViewById<TextView>(R.id.txt_preguntaActual)
    val radio_opcion1 = findViewById<TextView>(R.id.radio_opcion1)
    val radio_opcion2 = findViewById<TextView>(R.id.radio_opcion2)
    val radio_opcion3 = findViewById<TextView>(R.id.radio_opcion3)
    val radio_opcion4 = findViewById<TextView>(R.id.radio_opcion4)
    val btn_siguientePregunta = findViewById<TextView>(R.id.btn_siguientePregunta)




}