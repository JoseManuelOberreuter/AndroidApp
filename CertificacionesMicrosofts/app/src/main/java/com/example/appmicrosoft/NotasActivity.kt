package com.example.appmicrosoft

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.TextInputLayout
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class NotasActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)

        val btn_crearNota = findViewById<Button>(R.id.btn_crearNota)
        val til_notas = findViewById<TextInputLayout>(R.id.til_notas)
        val txt_notaOculta = findViewById<TextView>(R.id.txt_notaOculta)
        val linearLayout = findViewById<LinearLayout>(R.id.LinearLayout)


        // ESCUCHANDO EL CLIC DEL BOTON
        btn_crearNota.setOnClickListener {
            if (validarNota() == 0) {
                // Obtener el valor de la nota ingresada en el TextInputEditText
                val nota = til_notas.editText?.text.toString()

                // Crear un nuevo TextView
                val nuevoTextView = TextView(this)
                nuevoTextView.text = nota
                nuevoTextView.setBackgroundColor(Color.parseColor("#7EFFEB3B"))
                nuevoTextView.gravity = Gravity.CENTER_HORIZONTAL
                nuevoTextView.setPadding(25, 25, 25, 25)

                nuevoTextView.text = nota

                // Agregar el nuevo TextView al LinearLayout donde se mostrarán las notas
                linearLayout.addView(nuevoTextView)

                // Limpiar el campo de entrada de notas
                til_notas.editText?.text?.clear()
            }

        }
    }

    fun validarNota(): Int {

        // CONSTANTES
        val validator = Validator()
        var contador: Int = 0

        val til_notas = findViewById<TextInputLayout>(R.id.til_notas)
        val btn_crearNota = findViewById<Button>(R.id.btn_crearNota)

        // VARIABLE INPUT TIL_NOTAS
        var nota = til_notas.editText?.text.toString()


        // SI EL CAMPO ESTA NULO ENVIA ERROR
        if (validator.validarCampoNulo(nota)) {

            til_notas.error = getString(R.string.error_campos_nulos)
            contador++


        } else {
            til_notas.error = ""
        }


        return contador
    }
}