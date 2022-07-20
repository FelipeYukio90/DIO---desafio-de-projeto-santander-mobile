package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val eduardo = Cliente(nome = "Eduardo Campos", cpf= "987.789.231-98", ClienteTipo= ClienteTipo.PF, senha= "123456")


    println(eduardo)
    TesteAutenticacao().autentica(eduardo)

}