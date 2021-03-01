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


//    val n = readLine()!!.toInt()
//    var lista_velocidades = lis[] // lista que irá guardar todas as velocidades das tartarugas
//
//    for i in range(n): # laço
//
//    lista_velocidades.append(int(input(f'Velocidade da {i+1} Tartaruga:  ')))
//
//    maior = lista_velocidades[0] # definimos a maior velocidade como o primeiro item na lista
//
//    for velocidades in lista_velocidades: # vamos percorrer a lista e identificar a maior velocidade
//
//    if velocidades > maior:
//
//    maior = velocidades
//
//    # condições que irão validar o nível da tartargua mais veloz
//
//            if maior < 10:
//
//    print('A tartaruga mais veloz está no nível 1.')
//
//    elif maior < 20:
//
//    print('A tartaruga mais veloz está no nível 2.')
//
//    else:
//
//    print('A tartaruga mais veloz está no nível 3')
//
//


