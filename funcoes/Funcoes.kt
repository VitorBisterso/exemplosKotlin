// Unit == void
fun printar(mensagem: String): Unit {
    println(mensagem)
}

// Não existem parâmetros opcionais em java, teria que fazer um overload
// Unit implícito
fun printarComPrefixo(mensagem: String, prefixo: String = "Info") {
    println("[$prefixo] $mensagem")
}

// Função 'clássica'
fun soma(x: Int, y: Int): Int {
    return x + y
}

// Função com retorno 'Int' implícito
fun multiplica(x: Int, y: Int) = x * y

fun main() {
    printar("Olá")

    printarComPrefixo("Olá", "Log")
    printarComPrefixo("Olá")

    printarComPrefixo(prefixo = "Log", mensagem = "Olá")
    
    println(soma(1, 2))
    println(multiplica(2, 4))
}