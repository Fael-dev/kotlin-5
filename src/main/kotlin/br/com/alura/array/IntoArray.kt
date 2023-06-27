package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios: Array<BigDecimal> = Array<BigDecimal>(5) {BigDecimal.ZERO}
    // Funciona tbm com double, porém pode ser que o arredondamento fique estranho: 2500.55.toBigDecimal()
    salarios[0] = "2500.55".toBigDecimal()
    salarios[1] = 3500.65.toBigDecimal()
    salarios[2] = "4550.65".toBigDecimal()
    salarios[3] = 3300.65.toBigDecimal()
    salarios[4] = "7300.65".toBigDecimal()
    println("Salarios 1: ${salarios.contentToString()}")

    val salarios2: Array<BigDecimal> = bigDecimalArray("2500.89", "3449.90", "5449.90", "4449.90", "6449.90")
    val aumento: BigDecimal = "1.1".toBigDecimal()
    println("Salários 2: ${salarios2.contentToString()}")


    val salariosComAumento: Array<BigDecimal> = salarios2
            .map{ salario -> calculaAumentoRelativo(salario, aumento) }
            .toTypedArray()

    println("Salarios 2 com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial: BigDecimal = salariosComAumento.somatoria()
    println("Gasto inicial: $gastoInicial")

    val meses: BigDecimal = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        (acumulador + (salario * meses)).setScale(2, RoundingMode.UP) }
    println("Gasto total: $gastoTotal")

    val media: BigDecimal = salariosComAumento
            .sorted()
            .takeLast(3)
            .toTypedArray()
            .media()
    println("Média dos 3 últimos salários: $media")

    val mediaMenorSalarios: BigDecimal = salariosComAumento
            .sorted()
            .take(3)
            .toTypedArray()
            .media()

    println("Média menores salários: $mediaMenorSalarios")
}