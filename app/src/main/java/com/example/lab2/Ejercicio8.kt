package com.example.lab2

import java.util.Scanner

fun tr(numero1:Double):Double {
    if (numero1 > 40){
        val total:Double = ((40 * 12)+((numero1-40)*16))
        return total
    }
    else{
        return numero1 * 12
    }
}

fun main(){
    val reader = Scanner(System.`in`)
    println("horas")
    val tr1 = tr(reader.nextDouble())


    println("El pago es de $tr1")
}

