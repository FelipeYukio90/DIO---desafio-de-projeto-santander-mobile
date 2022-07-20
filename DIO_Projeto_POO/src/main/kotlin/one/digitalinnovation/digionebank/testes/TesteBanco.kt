package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("Digione", 22)
    println(digiOneBank.info())


    val banco2 = digiOneBank.copy("Banco2", 34)
    println(banco2.info()                                                                                                                            )

}