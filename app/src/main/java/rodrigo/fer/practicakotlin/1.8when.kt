package rodrigo.fer.practicakotlin

fun main() {
    val x = 5

    //When es un deribado del Switch
    when(x){
        1-> println("x es de valor 1")
        2-> println("x es de valor 2")
        3-> println("x es de valor 3")
        4-> println("x es de valor 4")

        else -> println("x no corresponde a ninguna de las condiciones")
    }
}