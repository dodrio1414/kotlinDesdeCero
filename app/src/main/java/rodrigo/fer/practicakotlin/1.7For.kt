package rodrigo.fer.practicakotlin

fun main() {
    //Listas Mutables
    var listaMutable = mutableListOf<String>("Rodrigo","Diego","Alvaro","Fernando","Enrique")
    listaMutable.add("Leo")
    listaMutable.removeAt(4)
    listaMutable.remove("Fernando")

    //Listas Inmutables
    var listaInmutable = listOf<String>("Rodrigo","Yturriaga","23")
    println("el index de la lista inmutable es: ${listaInmutable.indexOf("23")}")

    //For normal
    //withIndex() retorna la coleccion de la lista por el index
    for ((index,value) in listaMutable.withIndex()){
        println("Nombre: $value con un indece: $index")
    }

    //ForEach es un for pero mas sencillo para retornar los elementos
    listaInmutable.forEach { elementos -> println(elementos) }
    
    //ForEachIndexed retorna los elementos y el index
    listaInmutable.forEachIndexed { index, elemento -> println("Elemento $elemento con indice $index") }

}