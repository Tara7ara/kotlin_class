// Grupo: Marcel, John, Marti

fun generacionDelMapa (matrix1 :ArrayList<ArrayList<Char>>, matrix2 :ArrayList<ArrayList<Char>>, f: Int, c: Int) {

    // GENERAMOS EL MAPA CON EL NUMERO DE COLUMNAS Y FILAS ESTABLECIDO ANTERIORMENTE
    // ASIGNAMOS TAMBIEN A LA SEGUNDA MATRIZ LA MISMA ESTRUCTURA Y RESULTADOS QUE LA MATRIZ 1
    for ( i in 0 .. f +1){
        matrix1.add(arrayListOf())
        matrix2.add(arrayListOf())
        for ( j in 0 .. c +1){ // GENERACION DE LOS BORDES DEL MAPA
            if (i == 0){
                matrix1[i].add('#')
                matrix2[i].add('#')
            }
            else if (i == f +1){
                matrix1[i].add('#')
                matrix2[i].add('#')
            }
            else if (j == 0){
                matrix1[i].add('#')
                matrix2[i].add('#')
            }
            else if (j == c+1){
                matrix1[i].add('#')
                matrix2[i].add('#')
            }
            else { // GENERAMOS DE FORMA RANDOM LAS CELULAS
                val number = 0..2
                val randomNumber = number.random()
                if (randomNumber == 0) { // 33.33% VIVA
                    matrix1[i].add('0')
                    matrix2[i].add('0')
                }else if (randomNumber == 1 || randomNumber == 2) { // 66.66% MUERTA
                    matrix1[i].add('.')
                    matrix2[i].add('.')
                }
            }
        }
    }
}

fun reproduction(matriz1 :ArrayList<ArrayList<Char>>, matriz2 :ArrayList<ArrayList<Char>>, f: Int, c: Int): ArrayList<ArrayList<Char>> {

    for (i in 1..f){
        for (j in 1..c){
            if (Vida(matriz1, i, j) && matriz1[i][j] == '.'){
                matriz2[i][j] = '0'
            }
            if(Muerte(matriz1, i, j) && matriz1[i][j] == '0'){
                matriz2[i][j] = '0'
            }
            if(!Muerte(matriz1, i, j) && matriz1[i][j] == '0'){
                matriz2[i][j] = '.'
            }
        }
    }

    combinarMatrius(matriz2, matriz1, f, c) // PARA QUE LA MATRIZ 1 SEA IGUAL QUE LA MATRIZ 2 UNA VEZ SE HAYA REALIZADO, EL PASO DE REPRODUCCION
    return matriz2
}

fun Muerte(matriz1 :ArrayList<ArrayList<Char>>, PosI: Int, PosJ: Int): Boolean{

    var contadorCelulesVives = -1 // LO PONEMOS A -1 PORQUE SI NO TAMBIEN CONTARIA A SI MISMO A LA HORA DE HACER EL BUCLE

    for (i in PosI - 1..PosI + 1){
        for (j in PosJ - 1..PosJ + 1){
            if (matriz1[i][j] == '0') {
                contadorCelulesVives++;
            }
        }
    }

    return contadorCelulesVives == 2 || contadorCelulesVives == 3
}

fun Vida(matriz1 :ArrayList<ArrayList<Char>>, PosI: Int, PosJ: Int): Boolean{
    var contadorCelulesVives = 0

    for (i in PosI - 1..PosI + 1){
        for (j in PosJ - 1..PosJ + 1){
            if (matriz1[i][j] == '0') {
                contadorCelulesVives++;
            }
        }
    }

    return contadorCelulesVives == 3
}

fun combinarMatrius(matrizValoresOk:ArrayList<ArrayList<Char>>, matrizValoresAModificar :ArrayList<ArrayList<Char>>, f: Int, c: Int){

    for(i in 0..f+1) {
        for (j in 0..c + 1) {
            matrizValoresAModificar[i][j] = matrizValoresOk[i][j]
        }
    }
}

fun main(){
    // VARIABLES GROBALES DE LAS MATRICES
    var matrix1 = arrayListOf<ArrayList<Char>>()
    var matrix2 = arrayListOf<ArrayList<Char>>()

    println("Bienvenido al Juego de la vida")

    // PEDIMOS AL USUARIO EL NUMERO DE FILAS
    print("¿Cuantas FILAS quieres para el juego?: ")
    var f = readln().toIntOrNull() ?: 0

    // PEDIMOS AL USUARIO EL NUMERO DE COLUMNAS
    print("¿Cuantas COLUMNAS quieres para el juego?: ")
    var c = readln().toIntOrNull() ?: 0

    generacionDelMapa(matrix1, matrix2, f, c) // ESTA FUNCION GENERA LAS DOS MATRICES

    // MOSTRAMOS POR PANTALLA LA MATRIZ 2 DE FORMA BONITA
    var contador = 0
    var `next-day`:Int

    do {

        println("--MUNDO-- Day $contador")
        for(i in 0 .. matrix2.size -1){
            for(j in 0 .. matrix2[0].size -1){
                print("| ${matrix2[i][j]} ")
            }
            println("|")
        }

        // CONTADOR PARA SABER CUANTAS CELULAS VIVAS HAY
        var contadorVivas = 0
        for(i in 0 .. matrix2.size -1) {
            for (j in 0..matrix2[0].size - 1) {
                if (matrix2[i][j] == '0') {
                    contadorVivas++
                }
            }
        }
        println("Hoy dia $contador hay: $contadorVivas celulas vivas")

        // CONTADOR PARA SABER CUANTAS CELULAS MUERTAS HAY
        var contadorMuertas = 0
        for(i in 0 .. matrix2.size -1) {
            for (j in 0..matrix2[0].size - 1) {
                if (matrix2[i][j] == '.') {
                    contadorMuertas++
                }
            }
        }
        println("Hoy dia $contador hay: $contadorMuertas celulas muertas")

        println("Pulsa enter para pasar un frame de tu mundo o escribe 1 para finalizar")
        contador += 1
        reproduction(matrix1, matrix2, f, c)
        `next-day` = readLine()!!.toIntOrNull() ?: 0

    } while ( `next-day` != 1)
    println("Aqui se acaba el juego de la vida")
}