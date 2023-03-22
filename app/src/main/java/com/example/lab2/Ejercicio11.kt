package com.example.lab2

import java.util.Scanner

fun tr(numero1:Int){

    for (i in 1..12) {
        println("$numero1 x $i = ${numero1*i}");
    }

}

fun main() {

    val num = Scanner(System.`in`);
    println("Numero a multiplicar: ");
    tr(num.nextInt());
    
}