package rodrigo.fer.practicakotlin

fun main() {

    //WHILE
    var i = 0
    while (i < 5){
        ++i
        println(i)
    }

    //DO WHILE
    var sum=0
    var input:String
    do {
        println("Ingresar un numero: ")
        //los "!!" significa el parametro ingresado no puede ser null
        input= readln()!!
        sum+=input.toInt()
    }while (input!= "0")//termina si se ingresa el 0
    println("sum = $sum")
}