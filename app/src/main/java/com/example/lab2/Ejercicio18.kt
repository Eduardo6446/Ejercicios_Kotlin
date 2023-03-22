package com.example.lab2

fun main()
{
    var indice = 0

    val arreglo = arrayOf(1, 5, 1, 5, 8, 3, 6)

    println("Elementos del array")
    for(i in arreglo)
    {
        println("Elemento [$indice] = $i")
        indice += 1
    }
    var IndiceI = 0
    var IndiceJ = 0
    for(i in arreglo)
    {
        for(j in arreglo){
            if(arreglo[IndiceI] == arreglo[IndiceJ]){
                println("duplicado = $j")
            }
            IndiceJ += 1
        }
        IndiceI += 1
    }


}