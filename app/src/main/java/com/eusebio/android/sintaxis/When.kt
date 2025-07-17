package com.eusebio.android.sintaxis

fun main(){
    // estructura when parecido a el swiych pero con mas funcionalidades
    // puede mejoar la legibilidad del codigo
    // uede evaluar en multiples valores ,condiciones o rangos

    println(getDia(1))//lunes
    println(getDia(0))//dia no valido

    //obtener el rango de un numero
    println(getRango(-10))//el numero es negativo
    println(getRango(1))//esta entre 0 y 100
    println(getRango(200))//el numero esta entre 101 y 500
    println(getRango(1000))//el numero es mayor que 500
}


//funcion que devuelve el dia de la semana segun el numero que recibe por parametros
fun getDia(number:Int):String{
    //evaluar el numero con el when y devolver el nombre del dia
    //se puede retornar directamente el alor del when si guardarlo en una variable
    return when(number){
        1 -> "lunes"
        2 -> "martes"
        3 -> "miercoles"
        4 -> "jueves"
        5 -> "viernes"
        6 -> "sabado"
        7 -> "domingo"
        else -> "numero de dia no valido"
    }
}

//funcion quedevuelve el rango en ele que se encuentra el numero que resibe por parametros
fun getRango(number: Int): String {
    return when{
        //evaluar si el numero es negativo
        number < 0 -> "el numero es negativo"
        //permite evaluar rango en este caso avarca desde 0 a 100
        number in 0..100 -> "esta entre 0 y 100"
        //rango entre 101 y 500
        number in 101..500 -> "esta entre 101 y 500"
        // el nujmero no cumple con ninguna condicion anterior
        else -> "el numero es mayor que 500"
    }
}