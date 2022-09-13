package com.example.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //arrays()
        //seguridadNula()
        //funciones()
        clases()

    }
    fun arrays(){
        val nombre = "Carlos"
        val apellido = "Jimenez"
        val departamento = "Chalatenango"
        val edad = "32"

        //crear el arreglo
        val miArreglo = arrayListOf<String>()

        //añadir los datos
        miArreglo.add(nombre)
        miArreglo.add(apellido)
        miArreglo.add(departamento)
        miArreglo.add(edad)

        println(miArreglo)

        //añadir conjunto de datos
        miArreglo.addAll(listOf("Estudiantes","Programación IV"))

        println(miArreglo)

        // acceso a datos
        var miDepart = miArreglo[2]
        println(miDepart)
        println(miArreglo[5])

        //modificar
        miArreglo[0] = "Kemberly"
        println(miArreglo[0])

        //eliminar datos
        miArreglo.removeAt(2)
        println(miArreglo)

        miArreglo.forEach {
            println(it)
        }

        //otras operaciones
        println(miArreglo.count())
        miArreglo.clear()
        println(miArreglo.count())

    }

    //Seguridad contra nulos(null safety)
    fun seguridadNula(){
        var miString:String = "Promación IV 13/09/2022"
        //miString = null; Esto daria error de compilación
        println(miString)

        //variable, seguridad nula(null safety)
        var miSeguridadNula:String? = "valor de seguridad nula"
         miSeguridadNula = null
        println(miSeguridadNula)

        miSeguridadNula = "Le volvemos a dar un valor"
        //println(miSeguridadNula)

        if(miSeguridadNula != null){
            println(miSeguridadNula.toString()!!)
        }else{
            println(miSeguridadNula.toString())
        }

        println(miSeguridadNula?.length)
        miSeguridadNula?.let {
            println(it.toString())
        }?: kotlin.run {
            println(miSeguridadNula)
        }


    }

    fun funciones(){
        decirHola()
        decirHola()
        decirHola()

        decirNombre("Manuel")
        decirNombre("Alex")

        decirNombreyEdad("Cristina",19)

        var sumResultado = sumarDosNum(9,8)
        println(sumResultado)
        println(sumarDosNum(4,6))

        println(sumarDosNum(5,sumarDosNum(7,3)))
        println(sumarDosNum(sumarDosNum(8,2),sumarDosNum(7,3)))

    }
    //funcion simple
    fun decirHola(){
        println("Hola Estudiantes")
    }

    //funcion con parametros de entrada
    fun decirNombre(nombre:String){
        println("Hola tu nombre es $nombre")
    }

    fun decirNombreyEdad(nombre:String, edad:Int){
        println("Hola tu nombre es $nombre y tu edad es $edad años")
    }

    fun sumarDosNum(num1:Int,num2:Int):Int{
        val suma = num1+num2
        return suma
    }


    fun clases(){
        val persona1 = Estudiantes("Kimberly",21, arrayOf(Estudiantes.lengua.JAVA,Estudiantes.lengua.PYTHON))
        println(persona1.nombre)
        persona1.edad = 22
        println(persona1.codigo())

        val persona2 = Estudiantes("Antonio",23, arrayOf(Estudiantes.lengua.JAVASCRIPT), arrayOf(persona1))
        println(persona2.codigo())

        println("${persona2.amigo?.first()?.nombre} es amigo de ${persona2.nombre}")
    }

}

