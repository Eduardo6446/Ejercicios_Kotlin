package com.example.lab2

import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    println("hora")

    val num = reader.nextInt()

    if(num >= 6 && num <= 12){
        print("buenos dias")
    }
    else if(num >= 13 && num <= 20){
        print("buenas tardes")
    }
    else if(num >= 21 && num <= 5){
        print("buenass noches")
    }

}



