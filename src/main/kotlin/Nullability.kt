//EJERCICIO 1
//apartado a
var n: Int? = null // --> Pot ser NULL
var s = "21" // --> No pot ser NULL
val i = 203 // --> No pot ser NULL
var j: Int? = 408 // --> No pot ser NULL
val l1 = listOf(1, null, 2) // --> Pot ser NULL
val l2 = listOf(1, 5, 2) // --> No pot ser NULL
//apartado b
/*
n?.plus(i) --> 0
n ?: 0 --> 0
(n ?: 0) + 3 --> 3
n + i --> (n ?: 0) + i
i + j --> ((j ?:0)+i)%2==0
s + n --> s + (n?:"")
l1[2] + 3 --> ( l1 [2] ?: 0 ) + 3
l2[2] + 3 --> 5
 */

fun nullSafetySum(a: Int?, b: Int?): Int {
    return (a ?: 0) + (b ?: 0)
}
fun nullSafetyAverage(list: List<Int?>?): Double{
    //val s = "kjdhfglkjsdhfglkj"
    //val m = s.toIntOrNull() ?: 0
    //val n = s.toInt()

//    if ( list == null){
//        return 0.0
//    }

    list ?: return 0.0

    var suma = 0
    var count = 0

    for ( elem in list){
        suma += elem ?: 0
        ++ count
    }
    return (suma / count).toDouble()
}


fun main () {
    //val r = nullSafetySum(listOf(a:null, b:null))
    //println(r)
    val r2 = nullSafetyAverage(listOf(1,2,3,4,null,5))
    println(r2)
}