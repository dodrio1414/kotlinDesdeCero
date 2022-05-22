package rodrigo.fer.practicakotlin

fun main() {
    val numero1=5
    val numero2=20

    //condicional IF 1
    if (numero1>numero2){
        println("el numero mayor es $numero1")
    }else{
        println("el numero mayor es $numero2")
    }

    //condicional IF 2
    if (numero1>numero2) println("el numero mayor es $numero1") else println("el numero mayor es $numero2")

}