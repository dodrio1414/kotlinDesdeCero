package rodrigo.fer.practicakotlin

import androidx.annotation.Nullable

fun main() {

    //array genericos
    val arreglo = arrayOf("Rodrigo",23)
    println(arreglo)

    //clase generica
    Elemento("Rodrigo",)
    Elemento(71711174)
    //usar la clase person como un elemento y pasarle a la clase generica como un dato
    Elemento(Person("Rodrigo","Yturriaga",22))

    //clase generica con null
//    Elemento2<Nullable>()


}

//clase generica
//casi todos las funciones genericas son T o S en programacion
//pueden tener mas de un valor generico
class Elemento<T>(value: T){
    init {
        println(value)
    }
}

//data class generico
data class Person(val nombre:String, val apellido:String, val edad:Int)

///
//clase generica con null
//
//class Elemento2<T>(value: T?){
//    init {
//        if (value==null) throw IllegalAccessException("Se inicio elemento2 con un valor null")
//        println(value)
//    }
//}

//
//  EJEMPLO DE DOS ELEMENTOS GENERICOS
//
//class Elemento<T,S>(value: T, value2: S){
//    init {
//        println(value,value2)
//    }
//}