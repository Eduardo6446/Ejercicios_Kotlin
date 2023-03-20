package com.example.lab2

import java.util.Scanner

fun tr(numero1:Int, numero2:Int, numero3:Int){
    if(numero1 > numero2 && numero1 > numero3){
        if (numero2 > numero3){
            println("$numero1 $numero2 $numero3")
        }
        else{
            println("$numero1 $numero3 $numero2")

        }
    }
    if(numero2 > numero1 && numero2 > numero3){
        if (numero1 > numero3){
            println("$numero2 $numero1 $numero3")
        }
        else{
            println("$numero2 $numero3 $numero1")

        }    }
    if(numero3 > numero2 && numero3 > numero1){
        if (numero1 > numero2){
            println("$numero3 $numero1 $numero2")
        }
        else{
            println("$numero3 $numero2 $numero1")

        }
    }
}

fun main(){
    println("n1")
    val reader = Scanner(System.`in`)
    println("n2")
    val reader2 = Scanner(System.`in`)
    println("n3")
    val reader3 = Scanner(System.`in`)

    tr(reader.nextInt(),reader2.nextInt(),reader3.nextInt())


}

