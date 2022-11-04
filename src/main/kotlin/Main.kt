

fun main() {


    //Ejercicios de Condicionales



    println("EJERCICIO 1")
    println("Escribe tu nota que has obtenido este año: ")
    val nota = readln().toDouble()

    if (nota < 0 || nota > 10)
        println("IMPOSIBLE")
    else if (nota < 5)
        println("SUSPENDIDO")
    else if (nota > 5 && nota < 6)
        println("APROVADO")
    else if (nota > 6 && nota < 9)
        println("NOTABLE")
    else if (nota > 9)
        println("EXCELENTE")

    if (nota >= 9.5 && nota <= 10)
    println("\nMATRICULA DE HONOR")


    println("EJERCICIO 2")
    print("Di tres numeros y te voy a decir que numero es el mas grande :D")
    println("\nEscribe el valor A: ")
    val k = readln().toDouble()
    println("Escribe el valor B: ")
    val b = readln().toDouble()
    println("Escribe el valor C: ")
    val c = readln().toDouble()

    if (k > b && k > c)
        println("El numero $k es el mas grande :)")
    else if (b > c)
        println("El numero $b es el mas grande")
    else
        println("El numero $c es el mas grande")


    println("EJERCICIO 3")
    print("Di dos palabras")
    println("\nPrimera palabra: ")
    val d = readln()
    println("Segunda palabra: ")
    val e = readln()

    val aminuscula = d.lowercase()
    val bminuscula = e.lowercase()

    if (aminuscula < bminuscula)
        println("$d < $e")
    else if (aminuscula == bminuscula)
        println("$d = $e")
    else
        println("$d < $e")


    println("EJERCICIO 4")
    println("\nDi un numero decimal: ")
    val decimal = readln().toDouble()

    val dInt = decimal.toInt()
    val up = dInt + 1

    val round = if (decimal - dInt >= 0.5){
        up
    }else {
        dInt
    }
    println("up: $up, down: $dInt, round $round ")


    //Ejercicios de Loops

    println("Ejercicio 5")
    println("Escribe un numero y yo te dire todos los numeros que hay de x hasta el y (x e y incluidos)(recuerda, la x ha de ser mas grande que la y)")
    println("Escribe x: ")
    var numeroX = readln().toIntOrNull() ?: 0
    println("Escribe y: ")
    val numeroY = readln().toIntOrNull() ?: 0
    while ( numeroX > numeroY) {
        print("$numeroX ")
        --numeroX
    }
    println("$numeroX")
    //Aqui siempre sera que el x mas grande que el y, pero si no queremos esto, hacemos un if de las dos opciones


    println("Ejercicio 6")
    var a:Int = 0
    var r:Int = 0
    println("Di un numero y te dire la tabla de multiplicar")
    val n = readln().toIntOrNull() ?: 0
    while(a<9){
        a++
        r= n*a
        println("$n x $a = $r")
    }

    println("Ejercicio 7")
    println("Pon un numero y te dire todos los pares")
    val numeroej7 = readLine()?.toInt() ?: 0
    for (i in 0..numeroej7){
        if (i % 2 == 0 ){
            println("$i")
        }
    }

    println("Ejercicio 8")
    var modojuego = 0
    var numerorandom = 0

    do{
      println("Escoje el modo de juego 1 --> facil, 2 --> medio, 3 --> dificil")
      modojuego = readln().toInt() ?:0

      if (modojuego == 1){
          println("Dificultad Facil (1-100)")
          numerorandom = (1..100).random()
      }
      else if (modojuego == 2){
          println("Dificultad Media (1-1000)")
              numerorandom = (1..1000).random()
          }
      else if (modojuego == 3){
          println("Dificultad Dificil (1-100000)")
          numerorandom = (1..100000).random()
      }
    }while (modojuego < 1 || modojuego > 3)
    //do while es lo mismo que un while, lo he usao para saber como era su funcionamiento

    var numberPlayer = 0

    do{
        println("Di un numero :p")
        numberPlayer = readln().toInt()

        if (numberPlayer > numerorandom){
            println("El numero es menor")
        }else if (numberPlayer < numerorandom){
            println("El numero es mayor")
        }
    }while(numberPlayer != numerorandom)
    println("GG el numero es --> $numerorandom")

    println("Ejercicio 9")
    println("introduce un numero")
    var numeroej9 = readln().toInt()
    var digitos = 1

    if (numeroej9 == 0){
        digitos = 1
    }

    while (numeroej9 != 0){
        numeroej9 = numeroej9 / 10
        digitos += 1
    }
    println("en total hay $digitos digitos")



    println("Ejercicio 10")
    println("Escribe el mensaje que quieras cifrar")
    val text = readln()
    val xifrat = 3

    println("Este es el resultado:")
    for(lletra in text){
        val lletraXifrada = 'a' + (lletra + xifrat - 'a') % 26
        print(lletraXifrada.toChar())
    }

    println("\nEjercicio 11")
    println("Escribe el mensaje que contenga un numero y voy a cencurar el numero y algunas palabras prohibidas;)")
    val fraseusuario =  readln()
    val frase = fraseusuario.split(" ") //elimina los espacios
    var resultats = " "
    val palabrasprohibidas = listOf("hola", "gato", "enti")

    for (paraula in frase){

        if (paraula.toDoubleOrNull() != null || paraula in  palabrasprohibidas){
            resultats += "xxx "
        }else {

            resultats += paraula + " "
        }

    }
println("La frase cifrada es:$resultats")


    println("Ejercicio 12")
    println("Muevete utulizando las teclas n, s, e, o")
    println("Introduce tu proxima posicion (0,0): ")
    val position = readln()
    var PositionX = 0
    var PositionY = 0
    for (move in position){
        when (move) {
            'n' -> PositionY++  's' -> PositionY-- 'e' -> PositionX++ 'o' -> PositionX-- else -> { println("I-N-C-O-R-R-E-C-T-O") }
        }

    }

    println("Brujula --> ($PositionX,$PositionY)")

}
