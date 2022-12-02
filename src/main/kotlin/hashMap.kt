fun main(){

    do {
        print("Escriba la palabra que quiere analizar: ")
        val palabra = readln().lowercase()


        val emptyMap = hashMapOf<Char, Int?>()


        for (c in palabra) {
            if (c.code >= 'a'.code && c.code <= 'z'.code)
                emptyMap[c] = (emptyMap[c] ?: 0) + 1;
        }

        println(emptyMap)
    }while(palabra != "#")
}