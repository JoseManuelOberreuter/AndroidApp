package com.example.appmicrosoft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.widget.Button

class RegistrarUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_usuario)

        // VARIABLE BTN REGISTRARSE
        val btn_signup = findViewById<Button>(R.id.btn_signup)

        // INTENT HACIA MAINACTIVITY, YA QUE DESPUES DE REGISTRARSE TIENE QUE INICIAR SESION
        btn_signup.setOnClickListener {
            if (validarCampos() == 0) {
                val intent = Intent(this@RegistrarUsuarioActivity,MainActivity::class.java)
                startActivity(intent)

            }
        }

    }

    //FUNCION VALIDADORA
    fun validarCampos():Int{

        //VARIABLES DE FUNCION
        var contador:Int = 0
        val validator = Validator()

        val til_user = findViewById<TextInputLayout>(R.id.til_user)
        val til_email = findViewById<TextInputLayout>(R.id.til_email)
        val til_pass1 = findViewById<TextInputLayout>(R.id.til_pass1)
        val til_pass2 = findViewById<TextInputLayout>(R.id.til_pass2)


        var user = til_user.editText?.text.toString()
        var email = til_email.editText?.text.toString()
        var pass1 = til_pass1.editText?.text.toString()
        var pass2 = til_pass2.editText?.text.toString()


        //VALIDACION USUARIO
        if (validator.validarCampoNulo(user)) {
            til_user.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else {

            // VALIDACION NOMBRE DE USUARIO
            if (validator.validarNombre(user)) {
                til_user.error = "No se permiten caracteres especiales"
                contador++
            }
            else {

                // VALIDACION MINIMA DE CARACTERES PARA USUARIO
                if (validator.validaMinLongitud(user)){
                    til_user.error = "Minimo de caracteres requerido"
                    contador++
                }
                else {
                    // VALIDACION MAXIMO DE CARACTERES PARA USUARIO
                    if (validator.validaMaxLongitud(user)){
                        til_user.error = "Maximo de caracteres alcanzado"
                        contador++
                    }
                    else {
                        til_user.error = ""
                    }
                }
            }
        }





        //VALIDACION DE CORREO
        if (validator.validarCampoNulo(email)) {
            //Toast.makeText(this, "Correo nulo", Toast.LENGTH_SHORT).show()
            til_email.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else {
            //VALIDACION DE FORMATO CORREO
            if (validator.validarFormatoCorreo(email)){
                til_email.error = "Ingresa un email valido"
                contador++

            }
            else {
                til_email.error = ""
            }
        }




        //VALIDACION DE CONTRASEÑA 1
        if (validator.validarCampoNulo(pass1)) {
            til_pass1.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else{

            til_pass1.error = ""
        }

        //VALIDACION DE CONTRASEÑA 2
        if (validator.validarCampoNulo(pass2)) {
            til_pass2.error = getString(R.string.error_campos_nulos)
            contador++
        }
        else{

            til_pass2.error = ""
        }

        if (validator.validarCamposIguales(pass1,pass2)){
            til_pass1.error = "Contraseñas no coinciden"
            til_pass2.error = "Contraseñas no coinciden"

            contador++
        }


        //FIN DE FUNCION DE VALIDACION Y RETORNO DE CONTADOR
        return contador
    }
}





