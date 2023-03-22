package com.example.lab2

data class Clase(
    val profesor: String,
    val materia: String,
    val laboratorios: Int,
    val conferencias: Int
)

fun main() {
    val miClase = Clase("Eduardo el pro", "Programación  Grafica", 2, 4)
    println(miClase)
}