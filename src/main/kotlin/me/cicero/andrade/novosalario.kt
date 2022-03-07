package me.cicero.andrade

import java.util.*




fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val salario = input.nextDouble()
    val reajuste = when {
        salario > 2000.00 -> 4
        salario > 1200.01 -> 7
        salario > 800.01 -> 10
        salario > 400.01 -> 12
        else -> 15
    }

    //escreva o seu código nos espaços em branco

    val novoSalario = (salario + ((salario * reajuste) / 100.00))
    val salreaj = ((salario * reajuste) / 100.00)
    println("Novo salario: ${"%.2f".format(novoSalario)}.")
    System.out.printf("Reajuste ganho: ${"%.2f".format(salreaj)}")
    println()
    println("Em percentual: $reajuste%")


}