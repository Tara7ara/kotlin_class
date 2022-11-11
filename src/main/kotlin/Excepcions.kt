import java.lang.IndexOutOfBoundsException

fun main() {


}

fun makeSomeDangerousCalc(): Int {
    val randomNumber = (0..100).random()
    return if (randomNumber > 50) randomNumber
    else throw ArithmeticException()
}

fun error(): Int {

    return try{
        makeSomeDangerousCalc()
    }
    catch(e:ArithmeticException){
        -1
    }
}

fun error2(): Int {

    while(true) {
        try{
            val res = makeSomeDangerousCalc()
            return res
        }
        catch (e:ArithmeticException){
            println("Resultado incorrecto")
        }
    }
}



fun filterByIndex(list: List<Any>, indexs: List<Int?>): List<Any> {

    val resultat = arrayListOf<Any>()

    for (index in indexs) {
        try {
            resultat.add(list[index ?: continue])
        } catch (e: IndexOutOfBoundsException) {
            continue
        }
    }
    return resultat
}


fun cut(list: List<Any>, ini: Int, end: Int): List<Any> {

    val resultat = arrayListOf<Any>()

        try {
            for(i in ini .. end){
                resultat.add(list[i])
            }
        }catch (e: IndexOutOfBoundsException) {
            return resultat
        }
return resultat
}