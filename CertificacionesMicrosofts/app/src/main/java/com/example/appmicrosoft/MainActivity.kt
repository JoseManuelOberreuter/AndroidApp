package com.example.appmicrosoft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_login= findViewById<Button>(R.id.btn_login)
        val btn_signup= findViewById<Button>(R.id.btn_signup)


        btn_login.setOnClickListener {
            if (validarCampos() == 0) {
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                startActivity(intent)

            }
        }

        btn_signup.setOnClickListener {
            val intent = Intent(this@MainActivity,RegistrarUsuarioActivity::class.java)
            startActivity(intent)
        }
    }

    //FUNCION VALIDADORA
    fun validarCampos():Int{

        //VARIABLES DE FUNCION
        var contador:Int = 0
        val validator = Validator()

        val til_email = findViewById<TextInputLayout>(R.id.til_email)
        val til_pass = findViewById<TextInputLayout>(R.id.til_pass)

        var correo = til_email.editText?.text.toString()
        var pass = til_pass.editText?.text.toString()


        //VALIDACION DE CORREO
        if (validator.validarCampoNulo(correo)) {
            //Toast.makeText(this, "Correo nulo", Toast.LENGTH_SHORT).show()
            til_email.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else {
            //VALIDACION DE FORMATO CORREO
            if (validator.validarFormatoCorreo(correo)){
                til_email.error = "Ingresa un email valido"
                contador++

           }
            else {
                til_email.error = ""
            }
        }

        //VALIDACION DE CONTRASEÑA
        if (validator.validarCampoNulo(pass)) {
            //Toast.makeText(this, "Contraseña nula", Toast.LENGTH_SHORT).show()
            til_pass.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else{

            til_pass.error = ""
        }

        //FIN DE FUNCION DE VALIDACION Y RETORNO DE CONTADOR
        return contador
    }


    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }


    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("onDestroyq")
    }


}
