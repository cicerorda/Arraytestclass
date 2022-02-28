package me.cicero.andrade

fun main() {
    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0,"PJ")
    val maria = Funcionario("maria", 4000.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-------------")
    println(funcionarios.find { it.nome == "maria" })

    println("-------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =

     """
         Nome: $nome
         Salário: $salario
     """.trimIndent()
}