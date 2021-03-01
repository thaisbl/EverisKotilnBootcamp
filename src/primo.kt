import kotlin.math.sqrt

fun main() {
    val totalOfTests = readLine()?.toInt()
    totalOfTests?.let {
        for (i in 1..totalOfTests) {
            val num = readLine()?.toLong()
            num?.let {
                if (isPrime(num)) {
                    println("Prime")
                } else println("Not Prime")
            }
        }
    }
}

fun isPrime(n: Long): Boolean {
    when {
        n < 2 -> return false
        n == 2L -> return true
        n % 2 == 0L -> return false
        else -> {
            val sqrt = sqrt(n.toDouble()).toInt()
            var i = 3
            while (i <= sqrt) {
                if (n % i == 0L) {
                    return false
                }
                i += 2
            }
            return true
        }
    }
}

