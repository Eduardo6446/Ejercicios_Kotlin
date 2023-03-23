package com.example.lab2

import java.util.Scanner

fun tr(numero1:Int, numero2:Int = 2) = numero1 * numero2 / 2

fun main(){
    val reader = Scanner(System.`in`)
    println("primer numero")
    val reader2 = Scanner(System.`in`)
    println("segundo numero")
    val tr1 = tr(reader.nextInt(), reader2.nextInt())

    println("El area del triangulo es $tr1")
}

