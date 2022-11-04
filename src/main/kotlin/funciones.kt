fun main () {

    //welcom()
    //println(absolute(-4))
    /*var resultatFuncio = readInt();
    print(resultatFuncio)*/
    //multiply()

}

fun absolute(n: Int): Int {
    if (n >= 0)
        return n
    else
        return -n
}

fun welcom() {

    val nom = readln()
    println("Hola $nom")

}

fun readInt(): Int {

    //var numero_entero = readln().toIntOrNull() ?: "ERROR"
    var numero_entero = readln().toIntOrNull()
    while (numero_entero == null) {
        numero_entero = readln().toIntOrNull()
    }
    return numero_entero
}
fun multiply(a: Double, b: Int): Double {

    return a / ( 1 / b )

}
/*
fun isPrime(n: Int): Boolean {
    println("pon un numero y yo te dare todos los primeros que hay de este numero hasta el 1")
    val K = readln().toIntOrNull() ?: 0
    for (candidat in 1..K) {
        var isNotPrime = false

        for (i in 2..candidat - 1) {
            if (candidat.toInt() % i == 0) {
                isNotPrime = true
                break
            }
        }
        if (!isNotPrime) {
            print("$candidat  ")
        }

    }
    return ()
}*/

/*fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (Math.random() * (end - start + 1)).toInt() + start
}

 */
fun factorize(n: Int): List<Int> {

    val result = arrayListOf<Int>()
    var number = n

    for (x in 2 .. n ){
        if (number % x == 0){
            result.add(x)
            number /= x
        }
    }
    return result
}

fun isPerfect(n: Int): Boolean {
    var suma = 0

    for (x in 1 .. n / 2){
        if (n % x == 0){
            suma += x
        }
    }

    return n == suma
}


