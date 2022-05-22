package rodrigo.fer.practicakotlin

fun main() {
    //tenemos q estar seguros que las variables no sean nulas a menos que se desee esta

    //valor sin nulavilidad
    val nombre:String = "Rodrigo"

    //valor con null
    val apellido:String? = null
    val apellido2:String? = null

    println(nombre.length)

    //con "?" podemos decir que puede ser null
    //usar ? es lo mas recomendable
    println(apellido?.length)

    //con "!!" le estamos diciendo al valor apellido que no es null
    //muy peligroso usar !! para verficar nulavilidad
//
//    println(apellido2!!.length)
//

    val direccion:String? = null
    // "?:" elvis operator puede retornar otra cosa que en este caso es el "null"
    val c = direccion?.length ?: "no introduciste tu direccion"
    println(c)

    val direccion2:String? = "Indepenencia Cusco Q-10"
    //operador let para decidir si usamos o no la variable si NO ES NULA
    direccion2?.let {
        println(it)
    }

}