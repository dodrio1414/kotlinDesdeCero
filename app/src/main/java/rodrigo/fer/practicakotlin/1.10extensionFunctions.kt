package rodrigo.fer.practicakotlin

fun main() {
    val nombre = "Rodrigo"

    //funciones externas
    println(nombre.toUpperCase())
    println(nombre.toLowerCase())

    println(nombre.removerPrimerYUltimoCaracter())
    println(nombre.removerPrimerCaracter())
}

//funciones extension propias
//this hace regerencia al string
//lenght -1 hace regerencia a sacar o borrar el ultimo elemento
fun String.removerPrimerYUltimoCaracter(): String = this.substring(1,this.length-1)

fun String.removerPrimerCaracter(): String = this.substring(1).toUpperCase()