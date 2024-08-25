package org.example.personagem

import org.example.character.classes.IClasse
import org.example.character.races.IRaca

class Personagem(var raca : IRaca, var classe : IClasse) {
    var nome: String = ""
    var vida: Int = 10
    var pontosDeAtributos = 27

    val forca = Atributo("Força", 8, 0, 0)
    val destreza = Atributo("Destreza", 8, 0, 0)
    val constituicao = Atributo("Constituição", 8, 0, 0)
    val inteligencia = Atributo("Inteligência", 8, 0, 0)
    val sabedoria = Atributo("Sabedoria", 8, 0, 0)
    val carisma = Atributo("Carisma", 8, 0, 0)

    fun calcularVidaInicial() {
        vida += constituicao.buscarModificadorAtual() + constituicao.bonusRaca + constituicao.bonusClasse
    }

    fun distribuirPontosIniciais() {
        val atributosParaEscolher = mutableListOf<Atributo>(forca, destreza, constituicao, inteligencia, sabedoria, carisma)

        while (!atributosParaEscolher.isEmpty() || pontosDeAtributos > 1) {
            for (attr in atributosParaEscolher) {
                if (attr.niveisDisponiveis(pontosDeAtributos).isEmpty()) {
                    atributosParaEscolher.remove(attr)
                }
            }

            if (atributosParaEscolher.isEmpty()) {
                break
            }

            println("Seu saldo de pontos de atributo é: ${pontosDeAtributos}")
            println("Escolha um atributo para melhorar:")
            println("Opção | Atributo")
            for ((index, value) in atributosParaEscolher.withIndex()) {
                println("${index + 1}     | ${value.nome}")
            }

            print("Digite a opção: ")
            var atributoEscolhido = readln().toInt() - 1

            if (atributoEscolhido < 0 || atributoEscolhido >= atributosParaEscolher.count()) {
                println("Opção indisponível! Tente novamente...")
                println("--------------------------------------")
            }

            println("--------------------------------------")

            val niveisDisponiveis = atributosParaEscolher[atributoEscolhido].niveisDisponiveis(pontosDeAtributos)

            println("Escolha um nível para melhorar seu atributo '${atributosParaEscolher[atributoEscolhido].nome}':")

            println("Opção | Nível | Custo")
            for ((index, value) in niveisDisponiveis.withIndex()) {
                println("${index + 1}     |${value.nivel}     |${value.custo}")
            }

            print("Digite a opção: ")
            var nivelEscolhido = readln().toInt() - 1

            pontosDeAtributos -= niveisDisponiveis[nivelEscolhido].custo

            melhorarNivelAtributo(atributosParaEscolher[atributoEscolhido].nome, niveisDisponiveis[nivelEscolhido].nivel)

            println("Nível de '${atributosParaEscolher[atributoEscolhido].nome}' aprimorado!")
            println("--------------------------------------")

            if (pontosDeAtributos == 0) {
                break
            }

            atributosParaEscolher.remove(atributosParaEscolher[atributoEscolhido])
        }
    }

    fun melhorarNivelAtributo(nomeAtributo: String, novoNivel: Int) {
        when (nomeAtributo) {
            "Força" -> forca.nivelAtual = novoNivel
            "Destreza" -> destreza.nivelAtual = novoNivel
            "Constituição" -> constituicao.nivelAtual = novoNivel
            "Inteligência" -> inteligencia.nivelAtual = novoNivel
            "Sabedoria" -> sabedoria.nivelAtual = novoNivel
            "Carisma" -> carisma.nivelAtual = novoNivel
        }
    }

    fun rolarDadosIniciais() {
        println("Em desenvolvimento...")
    }

    fun distribuirPreDefinidosIniciais() {
        println("Em desenvolvimento...")
    }
}