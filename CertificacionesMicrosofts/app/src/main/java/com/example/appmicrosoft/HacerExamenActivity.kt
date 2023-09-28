package com.example.appmicrosoft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HacerExamenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hacer_examen)


        val btn_AZ900 = findViewById<Button>(R.id.btn_AZ900)
        val btn_IA900 = findViewById<Button>(R.id.btn_IA900)
        val btn_examen3 = findViewById<Button>(R.id.btn_AZ900)

        //INTENT HACIA 'HACER EXAMEN'
        btn_AZ900.setOnClickListener {
            val intent = Intent(this@HacerExamenActivity,InstruccionesExamenActivity::class.java)
            startActivity(intent)
        }

    }
}