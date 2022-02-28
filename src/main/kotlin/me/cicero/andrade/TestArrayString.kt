package me.cicero.andrade

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    for (nome in nomes) {
        println(nome)
    }
    println("------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("------------------")

    val nomes2 = arrayOf("maria", "zaza", "pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}