package com.example.lab2

import java.util.Scanner

fun tr(n:Int){

     for (i in 1..n) {
        // Imprime los espacios en blanco de la izquierda
        for (j in 1..n-i) {
            print(" ")
        }
        // Imprime los números de la primera mitad de la fila
        for (j in 1..i) {
            print(j)
        }
        // Imprime los números de la segunda mitad de la fila
        for (j in i-1 downTo 1) {
            print(j)
        }
        // Imprime un salto de línea al final de la fila
        println()
    }

}


fun main() {
    print("Ingrese el número de filas de la pirámide: ")
    val numero1 = Scanner(System.`in`);
    tr(numero1.nextInt());



   
}