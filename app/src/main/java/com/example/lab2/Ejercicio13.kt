package com.example.lab2

fun main() {
    // Declarar variables
    var x: Int = 144
    var y: Int = 999

    // Imprimir valores originales
    println("El valor de x es: $x")
    println("El valor de y es: $y")

    // Realizar operaciones aritméticas
    val suma = x.plus(y)
    val resta = x.minus(y)
    val multiplicacion = x.times(y)
    val division = x.toDouble().div(y.toDouble())

    // Imprimir resultados
    println("La suma de x e y es: $suma")
    println("La resta de x e y es: $resta")
    println("La multiplicación de x e y es: $multiplicacion")
    println("La división de x e y es: $division")
}