package com.example.lab2.Persona

class Persona(
    var nombres: String,
    var apellidos: String,
    var cedula: String,
    var sexo: String,
    var anioNacimiento: Int
) {
    // Métodos para obtener y establecer cada propiedad

    fun ObtenerNombres(): String {
        return nombres
    }

    fun ObtenerApellidos(): String {
        return apellidos
    }

    fun ObtenerCedula(): String {
        return cedula
    }

    fun ObtenerSexo(): String {
        return sexo
    }

    fun ObtenerAnioNacimiento(): Int {
        return anioNacimiento
    }
}

fun main() {
    val persona = Persona("Henry", "Gonzalez", "12345678", "M", 2005)

    println("Nombres: ${persona.ObtenerNombres()}")
    println("Apellidos: ${persona.ObtenerApellidos()}")
    println("Cedula: ${persona.ObtenerCedula()}")
    println("Sexo: ${persona.ObtenerSexo()}")
    println("Año de nacimiento: ${persona.ObtenerAnioNacimiento()}")
}