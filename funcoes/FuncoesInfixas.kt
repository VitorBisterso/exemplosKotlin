fun main() {
    /*
        Uma função infixa é uma função que pode ser chamada sem parênteses e ponto
        Regras para ser infixa:
            - Um único parâmetro;
            - O parâmetro não pode aceitar um número variável de argumentos
            e não pode ter um valor padrão.
    */
    infix fun Int.vezes(str: String) = str.repeat(this)
    println(2 vezes "Olá ")
    // O mesmo que
    println(2.vezes("Olá "))

    val par = "Ferrari" to "Abel"
    println(par)

    infix fun String.para(outro: String) = Pair(this, outro)
    val outroPar = "McLaren" para "Ceni"
    println(outroPar)

    val abel = Pessoa("Abel")
    val ceni = Pessoa("Ceni")
    abel conhece ceni
    // O mesmo que
    abel.conhece(ceni)

    for (pessoa in abel.pessoasConhecidas) println(pessoa.nome)
}

class Pessoa(val nome: String) {
    val pessoasConhecidas = mutableListOf<Pessoa>()
    infix fun conhece(outra: Pessoa) { pessoasConhecidas.add(outra) }
}