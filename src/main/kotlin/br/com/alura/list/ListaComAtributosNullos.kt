package br.com.alura.list

fun main() {
    listaLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach{ (editora: String?, livros: List<Livro>)->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}