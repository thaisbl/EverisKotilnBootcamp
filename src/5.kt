fun main() {

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val input = readLine()!!.toString()
        val n1 = input.subSequence(0,1).toString().toInt()
        val n2 = input.subSequence(2,3).toString().toInt()
        val letter = input.toCharArray()

        if (n1==n2) println(n1*n1)
        else if(letter[1].isLowerCase()) println(n2 + n1)
        else println(n2 - n1)

    }

}