package one.digitalinnovation.digionebank.testes

import Gerente

fun main() {
    val maria = Gerente("Maria","123.123.123.01",5000.0)

    println("${maria.nome} - ${maria.cpf} - ${maria.cpf}")

    ImprimeRelatorioFuncionario.imprime(maria)
}
