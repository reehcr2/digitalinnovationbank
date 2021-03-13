package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao","123.123.123.01",2000.0)

    println("${joao.nome} - ${joao.cpf} - ${joao.cpf}")

    ImprimeRelatorioFuncionario.imprime(joao)

}
