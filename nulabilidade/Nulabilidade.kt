fun main() {
    // Por padrão, o kotlin assumirá que a variável não pode ser nula, garantindo menos null pointers
    var nuncaNull: String = "Isso não pode ser null"
    //nuncaNull = null /* isso gera um erro de compilação */

    // Ao usarmos o '?', indicamos que essa variável pode ser nula
    var podeSerNull: String? = "Aceito nulos"
    podeSerNull = null

    var padraoNuncaNull = "Padrão é não nulo"
    //padraoNuncaNull = null

    fun tamanho(naoNula: String): Int {
        return naoNula.length
    }

    tamanho(nuncaNull)
    //tamanho(podeSerNull)  /* É gerado um erro de compilação pela possibilidade de ser null */
}