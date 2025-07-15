package com.eusebio.android

fun main(){
    //variable en kotlin
    var num1:Int=1
    var texto1:String ="texto1"
    //constante en kotlin
    val num2:Int=2
    val texto2:String ="texto2"

    //sumar valores numericos
    println("suma: ");
    println(num1+num2);

    //sumar dos strings
    println("suma de dos textos")
    println(texto1+texto2)

    //sumar un string con un int
    println("sumando tipod diferentes")
    println(texto1+num1)

    //llamar variables
    println("llamando variables de tipo int como: $num1 y de tipo string como: $texto1")

}