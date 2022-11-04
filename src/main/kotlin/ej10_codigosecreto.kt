fun main() {

    val text = readln()
    val xifrat = 3

    for(lletra in text){
        val lletraXifrada = 'a' + (lletra + xifrat - 'a') % 26
        print(lletraXifrada.toChar())
    }

}