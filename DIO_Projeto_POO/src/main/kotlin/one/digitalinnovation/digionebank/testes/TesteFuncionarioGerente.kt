package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente


fun main () {
    val maria = Gerente("Maria Eduarda", "123456789", 8000.0, "senha123")

    ImprimeRelatorioFuncionarioBonus.imprime(maria)

    TesteAutenticacao().autentica(maria)

}

