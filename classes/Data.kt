/*
    O termo 'data' indica que a classe gerará automaticamente
    toString, hashCode, equals e copy, além de um getter esquisito.
    
    No exemplo abaixo, estamos reimplementando o método equals
    para que sejam iguais apenas com o id.
*/

data class Usuario(val nome: String, val id: Int) {
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id
}

fun main() {
    val abel = Usuario("Abel", 1)
    println(abel)

    val outroAbel = Usuario("Abel", 1)
    val ceni = Usuario("Ceni", 2)

    // toString()
    println("abel == outroAbel: ${abel == outroAbel}")
    println("abel == ceni: ${abel == ceni}")

    // hashCode()
    println("hash abel: " + abel.hashCode())

    // Objetos com os mesmos atributos geram o mesmo hash code
    println("hash outro abel: " + outroAbel.hashCode())

    println("hash ceni: " + ceni.hashCode())

    // copy()
    println("cópia de abel: " + abel.copy())

    // O copy gera referências distintas
    println("abel === cópia: ${abel === abel.copy()}")

    // É possível copiar já alterando alguns valores, seguindo a mesma
    // ordem do construtor
    println("cópia abel novo nome: " + abel.copy("Outro nome"))
    println("cópia abel novo id: " + abel.copy(id = 3))

    // As funções com a sintaxe 'componentN' são geradas automaticamente
    // e funcionam como getters
    println("nome: ${abel.component1()}")
    println("id: ${abel.component2()}")
}