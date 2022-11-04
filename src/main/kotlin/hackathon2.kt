fun main() {
    println("HACKATHON")

    val elements = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")

    println("Numeros:")
    var contadorsenars = 0
    var contador = 0
    while (contador < elements.size - 1) {

        print("${elements[contador]}, ")
        contador++
    }
    print(elements[elements.size - 1])
    println("\n senars")
    while (contadorsenars < elements.size -1) {
        if (elements[contadorsenars].toDouble() % 2 != 0.0) {
            print("${elements[contadorsenars]}, ")
            if (contadorsenars == elements.size -2) {

                print("${elements[contadorsenars]}")
            }
        }



        contadorsenars++

    }
}