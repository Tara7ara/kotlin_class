fun main() {
    //print("Les xifres son: ")
    //print(comptaDigits(12412541))
    //print("factorial del numero es: ")
    //print(factorial(12))
    //print("La suma del digits es: ")
    //print(sumaDigits(123))/
    //        print("La paraula es palindrom: ")
    //print(esPalindrom("reconocer"))
    //
}

fun comptaDigits(n: Int): Int {
    if (n < 10 && n > -10) {
        return 1
    } else {
        return 1 + comptaDigits(n / 10)
    }
}

fun factorial(n: Int): Int {
    if (n == 1 || n == 0) {
        return 1
    }

    return n * factorial(n - 1)


}

fun sumaDigits(n: Int): Int {
    if (n == 0) {
        return 0
    }

    return sumaDigits(n / 10) + n % 10
}

fun esPalindrom2(p: String): Boolean {

    if (p == "" || p.length == 1)
    return true

    if (p.first() != p.last())
        return false

    // else
    return esPalindrom2(p.drop(1).dropLast(1))

}

fun esPalindrom(p: String): Boolean {
    if (p.length == 1 || p.isEmpty()) {
        return true;
    }

    return p[0] == p[p.length - 1] && esPalindrom(p.drop(1).dropLast(1))
}

fun invert(list: ArrayList<Any>){
    if (list.size <= 1){
        return
    }
    val element = list.removeFirst()
    list.add(element)
}
