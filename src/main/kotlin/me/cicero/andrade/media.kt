package me.cicero.andrade

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val nota1 = input.nextDouble()
    val nota2 = input.nextDouble()
    val nota3 = input.nextDouble()
    val media = (nota1 + nota2 + nota3) / 3  //complete os espaços em branco
    val printf = System.out.printf("MEDIA = %.1f\n", media)
}