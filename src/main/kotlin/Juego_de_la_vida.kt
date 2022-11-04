fun main () {

    JuegoDeLaVida()
}

fun JuegoDeLaVida () {

    println("Bienvenido al Juego de la vida")

    //random matrix

    println("Cuantas filas quieres para el juego?")
    val f = readln().toIntOrNull() ?: 0
    println("Cuantas columnas quieres para el juego?")
    val c = readln().toIntOrNull() ?: 0
    val matrix = arrayListOf<ArrayList<Char>>()
    println("Aqui tienes tu mundo")
    for ( i in 0 .. f -1){
        matrix.add(arrayListOf())
        for ( j in 0 .. c -1){

            val number = 0..2
            val randomNumber = number.random()
            if (randomNumber == 0) { //33.33% live
                matrix[i].add('O')
            }else if (randomNumber == 1 || randomNumber == 2) { //66.66% death
                matrix[i].add('.')
            }
        }
    }
    var contador = 0
    var `next-day`:Int
    do {
        //print matrix (O = live // . = death)
        println("--MUNDO-- Day $contador")
        for(i in 0 .. matrix.size -1){
            for(j in 0 .. matrix[0].size -1){
                print("| ${matrix[i][j]} ")
            }
            println("|")
        }
        println("Pulsa enter para pasar un frame de tu mundo o escribe 1 para finalizar")
        contador += 1

        //PROFE MIRA AQUÍ

        `next-day` = readLine()!!.toIntOrNull() ?: 0

    } while ( `next-day` != 1)
    println("Aqui se acaba el juego de la vida")

    fun reproductionTrue(l :ArrayList<ArrayList<Char>>): Boolean{
        var contadorCelulesVives = 0
        var reproducirCelula = false;
        var aux = l

        for (i in 0..2){
            for (j in 0..2){
                if (aux[i][j] == 'O') {
                    contadorCelulesVives++;
                    println(l[i][j])
                }else {
                    println(l[i][j])
                    continue;
                }
            }
        }
        return contadorCelulesVives == 3
    }

    fun reproduction(l :ArrayList<ArrayList<Char>>): ArrayList<ArrayList<Char>> {
        var aux = l;

        for (i in 1..f){
            for (j in 1..c){
                if (reproductionTrue(aux) && aux[i][j] == '.'){
                    aux[i][j] = 'O'
                }
            }
        }
        return aux
    }

}



