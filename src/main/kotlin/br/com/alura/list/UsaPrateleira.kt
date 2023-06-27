package br.com.alura.list

fun main() {
    val prateleira: Prateleira = Prateleira(
        genero = "Literatura",
        livros = listaLivros
    )
    val organizaPorAutor = prateleira.organizaPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizaPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()
}