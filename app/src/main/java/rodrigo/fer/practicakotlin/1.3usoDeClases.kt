package rodrigo.fer.practicakotlin

fun main() {
    //instancia en java
//    Persona persona = new Persona("Rodrigo","Yturriaga",23)

    //instanciar la clase
    val persona: Persona = Persona("Rodrigo","Yturriaga",23)
    persona.darBienvenida()

    val persona2 = Persona("Diego","Yturriaga",20)
    persona2.darBienvenida()

    val persona3 = Persona()
    persona3.darBienvenida()
}


class Persona(private val nombre:String = "",private val apellido: String = "",private val edad:Int = 0){
    fun darBienvenida(){
        println("hola $nombre $apellido\n" +
            "tu tienes $edad años")
    }
}