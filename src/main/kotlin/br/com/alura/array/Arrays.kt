package br.com.alura.array

fun testArray1() {
    val idades: IntArray = intArrayOf(25, 19, 21, 29)
    var maior: Int = Int.MIN_VALUE
    var menor: Int = Int.MAX_VALUE

    for (idade in idades) {
        if (idade > maior) {
            maior = idade
        }
    }


    idades.forEach { idade ->
        if (idade < menor) {
            menor = idade
        }
    }

    println("Maior idade $maior")
    println("Menor idade $menor")
}

fun testArray2() {
    val salarios: DoubleArray = doubleArrayOf(1550.0, 1990.89, 2500.5, 3600.0)
    val aumento: Double = 1.1
    var indice: Int = 0

    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }

    println("")
    println(salarios.contentToString())
    println(salarios)

    for(i in salarios.indices) {
        salarios[i] = salarios[i] * aumento
    }

    println("")
    println(salarios.contentToString())
    println(salarios)

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println("")
    println(salarios.contentToString())
    println(salarios)
}

fun testArray3() {
    val arrayString1: Array<String> = Array<String>(2) {"Rafael"; "Rodrigues"}
    val arrayString2 = Array<String>(3) {""}
    val arrayString3 = arrayOf("Posição 1", "Posição 2")

    arrayString2[0] = "teste"
    arrayString2[1] = "teste1"
    arrayString2[2] = "teste2"

    println(arrayString1.contentToString())
    println(arrayString2.contentToString())
    println(arrayString3.contentToString())
}

fun testRangesAndIntervals() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println("")

    val numerosPares = 2..100 step 2
    for (par in numerosPares) {
        print("$par")
    }

    println("")

    val numerosPares2 = 2.until(100) step 2
    for (par in numerosPares2) {
        print("$par ")
    }

    println("")

    val numerosParesReverso = 100 downTo(0) step 2
    numerosParesReverso.forEach { print("$it ") }

    println("")

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    println("")

    val alfabeto = "a".."z"
    val letra = "2"
    println(letra in alfabeto)
}

fun testSearchInArray() {
    val idades: IntArray = intArrayOf(10, 23, 33, 19, 11, 9)
    val maiorIdade: Int = idades.max()
    println("Maior idade $maiorIdade")

    val menorIdade: Int = idades.min()
    println("Menor idade $menorIdade")

    val media: Double = idades.average()
    println("Média das idades $media")

    val todosMaiores: Boolean = idades.all { it >= 18 }
    println("Todos maiores ? $todosMaiores")

    val existeMaior: Boolean = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores: List<Int> = idades.filter{ it >= 18 }
    println("Maiores ${maiores}")

    val busca: Int? = idades.find{ it > 18}
    println("Busca $busca")
}