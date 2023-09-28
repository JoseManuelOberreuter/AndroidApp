package com.example.appmicrosoft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        val btn_hacerExamen= findViewById<Button>(R.id.btn_hacerExamen)
        val btn_practicar= findViewById<Button>(R.id.btn_practicar)
        val btn_notasPreguntas= findViewById<Button>(R.id.btn_notasPreguntas)
        val btn_materialEstudio= findViewById<Button>(R.id.btn_materialEstudio)
        val btn_historialExamenes= findViewById<Button>(R.id.btn_historialExamenes)
        val btn_estadisticas= findViewById<Button>(R.id.btn_estadisticas)
        val btn_perfil= findViewById<Button>(R.id.btn_perfil)
        val btn_ayuda= findViewById<Button>(R.id.btn_ayuda)


        //INTENT HACIA 'HACER EXAMEN'
        btn_hacerExamen.setOnClickListener {
            val intent = Intent(this@HomeActivity,HacerExamenActivity::class.java)
            startActivity(intent)
        }

        //INTENT HACIA 'PRACTICAR'
        btn_practicar.setOnClickListener {
            val intent = Intent(this@HomeActivity,PracticarActivity::class.java)
            startActivity(intent)
        }

        //INTENT HACIA 'NOTAS'
        btn_notasPreguntas.setOnClickListener {
            val intent = Intent(this@HomeActivity,NotasActivity::class.java)
            startActivity(intent)
        }

        //INTENT HACIA 'MATERIAL DE ESTUDIO'
        btn_materialEstudio.setOnClickListener {
            val intent = Intent(this@HomeActivity,MaterialEstudioActivity::class.java)
            startActivity(intent)
        }

        //INTENT HACIA 'HISTORIAL DE EXAMENES'
        btn_historialExamenes.setOnClickListener {
            val intent = Intent(this@HomeActivity,HistorialExamenesActivity::class.java)
            startActivity(intent)
        }

        //INTENT HACIA 'ESTADISTICAS'
        btn_estadisticas.setOnClickListener {
            val intent = Intent(this@HomeActivity,EstadisticasActivity::class.java)
            startActivity(intent)
        }
        //INTENT HACIA 'PERFIL'
        btn_perfil.setOnClickListener {
            val intent = Intent(this@HomeActivity,PerfilActivity::class.java)
            startActivity(intent)
        }
        //INTENT HACIA 'AYUDA'
        btn_ayuda.setOnClickListener {
            val intent = Intent(this@HomeActivity,AyudaActivity::class.java)
            startActivity(intent)
        }
    }
}