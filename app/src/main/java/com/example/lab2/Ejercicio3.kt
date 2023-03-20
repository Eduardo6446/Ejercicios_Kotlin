package com.example.lab2

import java.util.Scanner

fun tr(numero1:Float) = numero1 * 12

fun main(){
    val reader = Scanner(System.`in`)
    println("horas")
    val tr1 = tr(reader.nextFloat())


    println("El pago es de $tr1")
}

