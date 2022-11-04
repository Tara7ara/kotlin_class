fun main() {

    println("Digite la palabra: ")
    var palabra = readln()
    var  palabraReversed = palabra.reversed()
    palabra.lowercase()
    palabraReversed.lowercase()

        if (palabra == palabraReversed){
            println("SI BB")
        }else{
            println("No BB")
        }

}