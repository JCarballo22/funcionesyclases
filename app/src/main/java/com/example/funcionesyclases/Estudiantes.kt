package com.example.funcionesyclases

class Estudiantes(val nombre:String,var edad:Int, val lenguajes:Array<lengua>, val amigo:Array<Estudiantes>? = null) {

    enum class lengua{
        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT,
        PYTHON

    }

    fun codigo(){
        for(lenguaje: lengua in lenguajes){
            println("Los lenguajes de programacion que conoces son: $lenguaje")
        }
    }
}