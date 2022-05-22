package rodrigo.fer.practicakotlin

//los data class son clases pero para guardar informacion
fun main(){
    val usuario = Usuario("Rodrigo","71711174","Cusco",23)
    println(usuario.toString())
    usuario.escribirHola()

    //usar metodo copy para hacer cambios de la primera instancia en una variable o constantes "val"
    val usuario2 = usuario.copy(nombre = "Diego",edad = 20)
    println(usuario2.toString())

    //comparar si son iguales
    println("son iguales? = ${usuario == usuario2}")
}

//Data class -> se pueden usar mas funciones como el toString
data class Usuario(private val nombre: String,private val dni: String,private val direccion: String,private val edad: Int) {
    fun escribirHola(){
        println("hola $nombre desde la Dataclase\n")
    }
}