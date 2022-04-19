// A palavra 'vararg' indica que o parâmetro tem tamanho variável
// Em runtime, é tratado como um Array
fun printarTodas(vararg mensagens: String) {
    for (m in mensagens) println(m)
}

fun printarTodasComPrefixo(vararg mensagens: String, prefixo: String) {
    for (m in mensagens) println(prefixo + m)
}

fun main() {
    printarTodas("Olá", "Hello", "Hallo", "Salut", "Hola", "你好")

    // Graças à possibilidade de colocar o nome específico do parâmetro,
    // é possível ter um parâmetro de tamnho variável e outros comuns
    printarTodasComPrefixo(
        "Olá", "Hello", "Hallo", "Salut", "Hola", "你好",
        prefixo = "Saudações: "
    )
}