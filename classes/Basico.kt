/*
    Essa declaração de classe abaixo é a mais simples existente.
    
    Ela apenas cria uma classe chamada 'Cliente' e um construtor
    vazio, sem qualquer argumento.
*/
class Cliente

/*
    Já nesse caso, a classe 'Contato' possui um atributo chamado
    'id', imutável, e outro chamado 'email', mutável.

    Nesse caso, é apenas criado por um construtor com ambos os atributos.
*/
class Contato(val id: Int, var email: String)

fun main() {
    // Note que em kotlin não usamos a palavra 'new'
    val cliente = Cliente()

    val contato = Contato(1, "email@email.com")

    println(contato.id)

    contato.email = "outro@email.com"
    println(contato.email)
}