package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome,cpf) {
    protected abstract fun calculoBonus(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Bonus: ${calculoBonus()}
    """.trimIndent()
}
