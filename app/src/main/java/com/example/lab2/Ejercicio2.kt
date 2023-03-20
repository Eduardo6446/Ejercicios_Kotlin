package com.example.lab2

import java.util.Scanner

const val pi = 3.1416
fun tr(numero1:Int) = pi * numero1*numero1

fun main(){
    val reader = Scanner(System.`in`)
    println("primer numero")

    val tr1 = tr(reader.nextInt())


    println("El area del circulo es $tr1")
}

