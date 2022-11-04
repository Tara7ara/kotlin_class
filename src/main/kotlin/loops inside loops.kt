import kotlin.math.sqrt

fun main() {

    println("Ejercicio 1:")

    var list1 = arrayListOf("a, b, c, d, e")
    var list2 = arrayListOf("c, e")
    var listaunio = arrayListOf<String>()

    listaunio.addAll(list1)
    for (element in list2){
        if (element !in listaunio){
            listaunio.add(element)
        }
    }
    println("$listaunio")

    val interseccio = arrayListOf<String>()
    for (e1 in list1){
        for(e2 in list2){
            if(e1 == e2){
                interseccio.add(e1)
            }
        }
    }

    println("Ejercicio 2:")
    println("pon un numero y yo te dare todos los primeros que hay de este numero hasta el 1")
    val K = readln().toIntOrNull() ?: 0
    for (candidat in 1 ..K){
        var isNotPrime = false

        for (i in 2 .. candidat - 1){
            if (candidat.toInt() % i == 0){
                isNotPrime = true
                break
            }
        }
        if (!isNotPrime){
            print("$candidat  ")
        }

    }

    println("Ejercicio 4:")
    val matrix = listOf(
        listOf("a", "b", "c"),
        listOf("d", "e", "f"),
        listOf("g", "h", "i")
    )

    println("Matriu normal")
    for(i in 0 .. matrix.size -1){
        for(j in 0 .. matrix[0].size -1){
            print("| ${matrix[i][j]} ")
        }
        println("|")
    }

    println("Matriu inversa")
    for(i in 0 .. matrix.size -1){

        var reversei = matrix.size -1 -i

        for(j in 0 .. matrix[0].size -1){
            var reversej = matrix.size -1 -j
            print("| ${matrix[reversei][reversej]} ")
        }
        println("|")
    }


    for (x in matrix){
        println("$x")
    }

    val primera_letra = matrix[0][0]
    println("$primera_letra")

    println(matrix.get(2))
    println(matrix.get(1))
    println(matrix.get(0))

    for ((posicion, valor) in matrix.withIndex()) {
        println("La posición $posicion contiene el valor $valor")
    }

    println("Ejercicio 6:")

    while (true) {
        println("Dime un numero y te hare una tabla de n*n o escribe \"para!\" para parar el programa")
        val n = readln().toIntOrNull()

        if ( n == null){
            break
        }
            //val matrix = arrayListOf(arrayListOf(3, 3, 3), arrayListOf(3, 3, 3), arrayListOf(3, 3, 3))
        for (j in 1..n) {
            for (i in 1..n) {
                print("$n ")
            }
            println()
        }

    }



    println("Ejercicio 8 apartado b:")

    val matrix2 = listOf(listOf(1, 2, 3),
                        listOf(4, 5, 6),
                        listOf(7, 8, 9))

    val files = matrix2.size - 1
    val columnes = matrix2[0].size - 1

    for ( i in 0 .. files ){
        var sumesfiles = 0

        for ( j in 0 .. columnes ){
            sumesfiles += matrix2[i][j]
        }
        println("La fila $i suma $sumesfiles")
    }

    println("F")
    val f = readln().toIntOrNull() ?: 0
    println("C")
    val c = readln().toIntOrNull() ?: 0
    val matrix1 = arrayListOf<ArrayList<Int>>()

    for ( i in 0 .. f -1){
        matrix1.add(arrayListOf())
        for ( j in 0 .. c -1){
            println("Introdueix el contingut: ")
            val element = readln().toIntOrNull()?:0
            matrix1[i].add(element)
        }
    }
    println(matrix1)


    println("Ejercicio 9")
/*
    println("Escribe tu dni")
    val dni = readln().toIntOrNull() ?: 12345678
    println("Escribe tu letra del dni")
    var dni_letra = readln()

    var residuo = 0

    residuo = dni % 23

    val dni_list = listOf(
        'T',
        'R',
        'W',
        'A',
        'G',
        'M',
        'Y',
        'F',
        'P',
        'D',
        'X',
        'B',
        'N',
        'J',
        'Z',
        'S',
        'Q',
        'V',
        'H',
        'L',
        'C',
        'K',
        'E'
    )

    //fer servir la llista per per pasar la lletra que toca, ja que començem desde el 0


    if (residuo == 0 && dni_letra.){

        println("tu letra es la T")

    }else if (residuo == 1){
        println("tu letra es la R")
    }else if (residuo == 14){
        println("tu letra es la Z")
    }
    */

    var a = true

    while (a == true) {
        var b = true
        while (b == true) {
            print("Introdueix el DNI a verificar (sense la lletra): ")
            var numero = readln().toIntOrNull() ?: 0
            print("Introdueix la lletra (MAJUSCULA): ")
            var letra = readLine()
            var numero2 = numero
            if (numero2.toString().length == 8) {
                b = false
            } else {
                println("Valor incorrecte, torna a intentar.")
                break
            }
            numero = numero % 23
            var letras = listOf(
                "T",
                "R",
                "W",
                "A",
                "G",
                "M",
                "Y",
                "F",
                "P",
                "D",
                "X",
                "B",
                "N",
                "J",
                "Z",
                "S",
                "Q",
                "V",
                "H",
                "L",
                "C",
                "K",
                "E"
            )
            var comp = numero2.toString() + letras[numero]
            var comp2 = numero2.toString() + letra
            //println("\nEl teu DNI es $numero2${letras[numero]}")
            if (comp == comp2) {
                println("\nEl DNI es correcte")
            } else {
                println("\nEl DNI es incorrecte")
                print("El DNI correcte es $comp")
            }
            println("\n----------------------------------------------")

        }
    }
}
