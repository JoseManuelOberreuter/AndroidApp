package com.example.appmicrosoft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InstruccionesExamenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones_examen)



        val btn_comenzarExamen = findViewById<Button>(R.id.btn_comenzarExamen)


        //INTENT HACIA 'HACER EXAMEN AZ 900'
        btn_comenzarExamen.setOnClickListener {
            val intent = Intent(this@InstruccionesExamenActivity,ExamenAZ900Activity::class.java)
            startActivity(intent)
        }




    }
}