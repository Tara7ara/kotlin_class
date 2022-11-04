import kotlin.system.exitProcess

fun main() {
    prueba()
}

fun prueba (){

    val matrix = listOf(listOf("a", "b", "c"),
                        listOf("d", "e", "f"),
                        listOf("g", "h", "i"))

    val primeraLlista = matrix[0]
    val primerElement = primeraLlista[0]

    println("Di dos numeros y te digo una letra")
    println("El primer numero es (0-1-2) [si pones un numero mayor se convertira en un 0]")
    var firstnumber = readln().toIntOrNull() ?: 0
    println("El segundo numero es (0-1-2) [si pones un numero mayor se convertira en un 0]")
    var secondnumber = readln().toIntOrNull() ?: 0

    if (firstnumber > 2) {firstnumber = 0}
    else { if (secondnumber > 2) {secondnumber = 0} }

    val lletrarandom = matrix[firstnumber][secondnumber]

    println("Te mostrare la letra --> $lletrarandom")
}
