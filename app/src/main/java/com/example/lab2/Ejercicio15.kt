package com.example.lab2

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    val suma = numeros.sum()
    val promedio = numeros.average()
    
    println("La suma es: $suma")
    println("El promedio es: $promedio")
}