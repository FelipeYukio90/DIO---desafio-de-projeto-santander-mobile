package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main () {
    val joao = Analista("Joao Paulo", "123456789", 2000.0)
    ImprimeRelatorioFuncionarioBonus.imprime(joao)

}

