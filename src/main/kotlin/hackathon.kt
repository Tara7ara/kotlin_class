fun main(){
    println("HACKATHON")

    println("Pon una palabra ")
    var paraula = readln().toCharArray()
    var contadorA = 0
    var contadorE = 0
    var contadorI = 0
    var contadorO = 0
    var contadorU = 0

    for (i in paraula.indices){
        if (paraula[i]=='a' || paraula[i]=='A') {
            contadorA++
        }
        else if (paraula[i]=='e' || paraula[i]=='E') {
            contadorE++
        }
        else if (paraula[i]=='i' || paraula[i]=='I') {
            contadorI++
        }
        else if (paraula[i]=='o' || paraula[i]=='O') {
            contadorO++
        }
        else if (paraula[i]=='u' || paraula[i]=='U') {
            contadorU++
        }
    }
    println("a: $contadorA")
    println("e: $contadorE")
    println("i: $contadorI")
    println("o: $contadorO")
    println("u: $contadorU")

}