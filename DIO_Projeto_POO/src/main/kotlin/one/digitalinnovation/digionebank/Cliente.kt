package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456"== senha

    override fun toString(): String = """        
        Nome: $nome
        CPF: $cpf
        Tipo de conta: ${ClienteTipo.descricao}
        
        
    """.trimIndent()
}