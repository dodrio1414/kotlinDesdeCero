package rodrigo.fer.practicakotlin

fun main() {
    //instancia en java
//    Persona persona = new Persona("Rodrigo","Yturriaga",23)

    //instanciar la clase
    val persona: Persona = Persona("Rodrigo","Yturriaga",23)
    persona.darBienvenida()

    val persona2 = Persona("Diego","Yturriaga",20)
    persona2.darBienvenida()
}


class Persona(var nombre:String, var apellido: String,var edad:Int){
    fun darBienvenida(){
        println("hola $nombre $apellido\n" +
            "tu tienes $edad años")
    }
}