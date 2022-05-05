/*
    Apesar de suportar completamente a orientação a objetos, existem
    mais alguns termos para complementar.

    Por padrão, nenhuma classe pode ser herdada. Para haver essa possibilidade,
    é preciso colocar o termo 'open', indicando que essa pode ser uma
    superclasse.

    O mesmo se aplica aos métodos de uma classe, aqueles que poderão,
    eventualmente, serem reimplementados, devem ter o termo 'open', também.
*/
open class Catioro(var nome: String, val fofo: Boolean) {
    open fun latir() {
        println("au au!")
    }
}

/*
    Para herdar de uma classe, basta colocar a sintaxe ' : SuperClasse()'.

    Os parênteses '(argumentos)' indicam a chamada para o construtor padrão da superclasse.

    Para reimplementar um método da superclasse, também usamos override.

    Note que o parâmetro 'nome', não é 'var' ou 'val', é um argumento próprio
    de construtor, cujo valor já é passado à superclasse.

    Podemos passar parâmetros personalizados ou não, como abaixo.
*/
class Rottwagner(nome: String) : Catioro(nome = nome, fofo = true) {
    override fun latir() {
        println("wuf wuf!")
    }
}

fun main() {
    val catioro: Catioro = Rottwagner("Rex")
    println(catioro.nome)
    println(catioro.fofo)
    catioro.latir()
}