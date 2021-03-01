fun main() {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        lista.add(mdc(input[0],input[1]))
    }
    lista.forEach { println(it) }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    var first = n1
    var second = n2
    while (first != second) {
        if (first > second)
            first -= second
        else
            second -= first
    }
    return first
}

fun mdc2(n1: Int, n2: Int) {
    var n1 = n1
    var n2 = n2
    while (n2 != 0) {
        var fator: Int = n1 % n2
        n1 = n2;
        n2 = fator;
    }
}