package com.example.lab2


class Insecto(
    private val longitud: Float,
    private val numAlas: Int,
    private val numPatas: Int,
    private val color: String,
    private val numAntenas: Int,
    private val tipoInsecto: String
) {
    fun imprimirValores() {
        println("Longitud: $longitud")
        println("Número de alas: $numAlas")
        println("Número de patas: $numPatas")
        println("Color: $color")
        println("Número de antenas: $numAntenas")
        println("Tipo de insecto: $tipoInsecto")
    }
}

fun main() {
    val insecto = Insecto(2.5f, 2, 6, "verde", 2, "mariposa")
    insecto.imprimirValores()
}