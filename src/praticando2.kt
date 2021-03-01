const val soma = 1
const val subtr = 2
const val mult = 3
const val divi = 4

fun main (){

    val n1 = readLine()?.toFloat()
    val n2 = readLine()?.toFloat()


    if (n1 == null || n2 == null){println("INSIRA VALORES NÃO-NULOS")}
    else {
        val answer = calculator(n1,n2,2)
        println(answer)}
}


fun calculator (a:Float, b:Float, c:Int):Float {

    return when (c) {
        1 -> {println ("somando...");a.plus(b)}
        2 -> {println ("subtraindo...");a.minus(b)}
        3 -> {println ("multiplicando...");a.times(b)}
        4 -> {println ("dividindo...");a.div(b)}
        else -> {println("Selecione uma operação válida"); 0.0f}

    }
}