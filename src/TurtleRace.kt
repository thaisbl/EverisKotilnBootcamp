fun main() {

    while (true) {
        try {
            val l = readLine()!!.toInt()
            val lista = mutableListOf<Int>()
            val v = readLine()!!.split(" ").run {
                this.forEach {
                    lista.add(it.toInt())
                }
            }
            lista.sort()
            val a = lista[lista.lastIndex]
            if (a<10) println("1")
            else if (a<20) println("2")
            else println("3")

        } catch (f: FileSystemException) {
            break
        } catch (n: NullPointerException) {
            break
        } catch (e: Exception) {
            break
        }
    }
}


