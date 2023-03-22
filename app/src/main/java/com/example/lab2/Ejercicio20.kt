package com.example.lab2

// Clase abstracta Figura
abstract class Figura(val nombre: String) {
    abstract fun area(): Double
}

// Subclase Triangulo
class Triangulo(val base: Double, val altura: Double) : Figura("Triangulo") {
    override fun area(): Double {
        return base * altura / 2
    }
}

// Subclase Cuadrado
class Cuadrado(val lado: Double) : Figura("Cuadrado") {
    override fun area(): Double {
        return lado * lado
    }
}

// Subclase Circulo
class Circulo(val radio: Double) : Figura("Circulo") {
    override fun area(): Double {
        return Math.PI * radio * radio
    }
}

// Subclase Rectangulo
class Rectangulo(val base: Double, val altura: Double) : Figura("Rectangulo") {
    override fun area(): Double {
        return base * altura
    }
}


fun main() {
    //val scanner = Scanner(System.`in`)

    // Pedir valores para un Triangulo
    //print("Ingrese la base del Triangulo: ")
    //val baseT = scanner.nextDouble()
    //print("Ingrese la altura del Triangulo: ")
    //val alturaT = scanner.nextDouble()
    // base y altura
    val base:Double = 3.0;
    val altura:Double = 5.0;
    val triangulo = Triangulo(base, altura);

    // Pedir valores para un Cuadrado
    //print("Ingrese el lado del Cuadrado: ")
    //val ladoC = scanner.nextDouble()
    val lado:Double = 3.0;
    val cuadrado = Cuadrado(lado);

    // Pedir valores para un Circulo
    //print("Ingrese el radio del Circulo: ")
    //val radioC = scanner.nextDouble()
    val radio:Double = 2.0
    val circulo = Circulo(radio);

    // Pedir valores para un Rectangulo
    //print("Ingrese la base del Rectangulo: ")
    //val baseR = scanner.nextDouble()
    //print("Ingrese la altura del Rectangulo: ")
    //val alturaR = scanner.nextDouble()
    //base y altura
    val base2:Double = 1.0;
    val altura2:Double =  2.0;
    val rectangulo = Rectangulo(base2, altura2);

    // Calcular y mostrar el área de cada figura
    println("El área del ${triangulo.nombre} es: ${triangulo.area()}")
    println("El área del ${cuadrado.nombre} es: ${cuadrado.area()}")
    println("El área del ${circulo.nombre} es: ${circulo.area()}")
     println("El área del ${rectangulo.nombre} es: ${rectangulo.area()}")

}