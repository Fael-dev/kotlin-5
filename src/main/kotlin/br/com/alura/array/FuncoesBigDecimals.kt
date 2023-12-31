package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

// vararg permite passar quantos parametros quiser, ex: bigDecimalArray("2"), bigDecimalArray("2", "4")...
fun bigDecimalArray(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce{ acumulador, valor -> acumulador + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}