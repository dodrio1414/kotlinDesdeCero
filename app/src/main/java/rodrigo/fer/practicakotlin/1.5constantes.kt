package rodrigo.fer.practicakotlin

//constante global
const val direccion = "Q-10 Cusco"

fun main() {
    println(direccion)
    println(Constantes.direccion)

    //Print del enumClass
    println(Dias.Lunes.nombreDelDia)
    println(Dias.Martes.nombreDelDia)
    println(Dias.Domingo.nombreDelDia)
}


class Constantes{
    //similar al public static de Java en cosntantes
   companion object{
       const val direccion = "Q-10 Cusco Independencia"
   }
}

//enum class
//sivre para llevar mejor la contavilidad de las cosntantes y poder cambiar en un futuro
enum class Dias(val nombreDelDia:String){
    Lunes(nombreDelDia = "Monday"),
    Martes(nombreDelDia = "Tuesday"),
    miercoles(nombreDelDia = "Wendnesday"),
    Jeuves(nombreDelDia = "Thursday"),
    Viernes(nombreDelDia = "Friday"),
    Sabado(nombreDelDia = "Saturday"),
    Domingo(nombreDelDia = "Sunday")
}