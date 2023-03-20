package com.example.lab2

import java.util.Scanner

fun main(){
    val semana = arrayOfNulls<String>(7)
    semana[0] = "lunes"
    semana[1] = "Martes"
    semana[2] = "Miercoles"
    semana[3] = "Jueves"
    semana[4] = "Viernes"
    semana[5] = "Sabado"
    semana[6] = "Domingo"

    val reader = Scanner(System.`in`)
    println("numero")
    val num = reader.nextInt()

    for(i in semana.indices){
        if (i == num){
            println("${semana[i-1]}")
        }
    }
}

