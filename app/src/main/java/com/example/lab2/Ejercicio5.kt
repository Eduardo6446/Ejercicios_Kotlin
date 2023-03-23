package com.example.lab2

import java.util.Scanner

fun main() {
    print("Ingrese una hora (formato 24 horas): ")
    val hora = readLine()?.toIntOrNull()
    
    if (hora != null) {
        when (hora) { 
            in 6..12 -> println("Buenos días")
            in 13..20 -> println("Buenas tardes")
            else -> println("Buenas noches")
        }
    } else {
        println("Hora inválida")
    }
}
