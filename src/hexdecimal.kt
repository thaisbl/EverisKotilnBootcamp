fun main() {
    var programRunning = true
    while (programRunning) {
        val input = readLine()
        input?.let {
            when {
                input.startsWith("0x") -> println(input.removePrefix("0x").toInt(16))
                input.toInt()<0 -> programRunning = false
                else -> println("0x${Integer.toHexString(input.toInt()).toUpperCase()}")
            }
        }
    }
}