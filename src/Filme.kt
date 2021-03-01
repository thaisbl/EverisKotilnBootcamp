data class Filme(
    var name: String,
    var data: String
) {
}

fun main() {

    val filme1 = Filme("Filme 1","01/01/21")
    val filme2 = Filme("Filme 2","02/01/21")
    val filme3 = Filme("Filme 3","03/01/21")

    val listaAssistidos = mutableListOf<Filme>(filme1,filme2,filme3)
    println(listaAssistidos)
    listaAssistidos.removeAt(1)
    println()
    println(listaAssistidos)

}