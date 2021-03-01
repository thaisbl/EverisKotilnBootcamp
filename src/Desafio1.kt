fun main() {
    //continue a solução
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val number = readLine()!!.toDouble()
        var div = 2.0
        while (div<=number){
            if (number%div==0.00){
                if (div!=number) {
                    println("Not Prime")
                    break
                } else {
                    println("Prime")
                    break
                }
            } else div++
        }
    }

}