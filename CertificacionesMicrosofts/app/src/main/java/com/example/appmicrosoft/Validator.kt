package com.example.appmicrosoft

import android.util.Patterns
import java.util.regex.Pattern

class Validator {

    //VALIDA QUE EXISTAN CARACTERES
    fun validarCampoNulo(texto:String):Boolean{
        return texto.trim().equals("") || texto.trim().length==0
    }

    //VALIDA QUE DOS INPUTS SEAN IGUALES
    fun validarCamposIguales(texto:String,texto2: String):Boolean{
        return !texto.trim().equals(texto2.trim())
    }
    //VALIDA QUE SOLO TENGA LETRAS
    fun validarNombre(nombre:String):Boolean{
        val pattern = Pattern.compile("^[a-zA-Z ]+\$")
        return !pattern.matcher(nombre).matches()
    }
    fun validarFormatoCorreo(correo:String):Boolean{
        return !Patterns.EMAIL_ADDRESS.matcher(correo).matches()
    }

    //VALIDAR MIN 4 Y MAX 30 CARACTERES
    fun validaMinLongitud(input: String): Boolean {
        val minLength = 8
        val length = input.length
        return length <= minLength
    }

    fun validaMaxLongitud(input: String): Boolean {
        val maxLength = 30
        val length = input.length
        return length >= maxLength
    }


    //VALIDA QUE SEA UN NUMERO DE TELEFONO
    fun validaNumeroTelefono(input:String):Boolean{
        return !Patterns.PHONE.matcher(input).matches()
    }


}