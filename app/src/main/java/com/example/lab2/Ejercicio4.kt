package com.example.lab2

fun main() {
    val words = listOf(
        "Apple" to "Manzana",
        "Book" to "Libro",
        "Car" to "Coche",
        "Dog" to "Perro",
        "Elephant" to "Elefante",
        "Fish" to "Pez",
        "Guitar" to "Guitarra",
        "House" to "Casa",
        "Ice cream" to "Helado",
        "Jacket" to "Chaqueta"
    )

    println("English\t\tSpanish")
    println("========================")
    for ((english, spanish) in words) {
        println("$english\t\t$spanish")
    }
}