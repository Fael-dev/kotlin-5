package br.com.alura.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizaPorAutor(): List<Livro> {
        return this.livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return this.livros.sortedBy { it.anoPublicacao }
    }
}

// sortBy => Ordena a instância da mutable list
// sortedBy => Cria e Retorna uma nova lista ordenada da list
