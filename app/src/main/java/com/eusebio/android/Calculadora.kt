package com.eusebio.android

fun main(){

    println("sumando: "+ sumar(1.0,2.0))
    println("restando: "+ restar(2.0,1.0))
    println("multiplicando: "+ multiplicar(2.0,2.0))
    println("dividir: "+ dividir(10.0,5.0))
}

fun sumar(num1:Double,num2:Double): Double {
    return num1+num2;
}

fun restar(num1: Double,num2: Double):Double{
    return num1-num2;
}

fun multiplicar (num1: Double,num2: Double):Double{
    return num1*num2;
}

fun dividir(num1:Double,num2:Double):Double{
    if(num2==0.0){
        throw ArithmeticException ("no se puede dividir por 0")
    }
    else{
        return num1/num2
    }
}