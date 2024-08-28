package org.example.personagem

import org.example.character.classes.IClasse
import org.example.character.races.IRaca
import org.example.dado.D6

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

    val atributosParaEscolher = mutableListOf<Atributo>(forca, destreza, constituicao, inteligencia, sabedoria, carisma)

    fun calcularVidaInicial() {
        vida += constituicao.buscarModificadorAtual()
    }

    fun distribuirPontosIniciais() {
        while (!atributosParaEscolher.isEmpty() || pontosDeAtributos > 1) {
            for (attr in atributosParaEscolher) {
                if (attr.niveisDisponiveis(pontosDeAtributos).isEmpty()) {
                    atributosParaEscolher.remove(attr)
                }
            }

            if (atributosParaEscolher.isEmpty()) {
                break
            }

            println("Seu saldo de pontos de atributo é: $pontosDeAtributos")
            println("Escolha um atributo para melhorar:")

            val atributoEscolhido = escolherAtributo()

            println("--------------------------------------")

            val niveisDisponiveis = atributosParaEscolher[atributoEscolhido].niveisDisponiveis(pontosDeAtributos)

            println("Escolha um nível para melhorar seu atributo '${atributosParaEscolher[atributoEscolhido].nome}':")

            println("Opção | Nível | Custo")
            for ((i, value) in niveisDisponiveis.withIndex()) {
                println("${i + 1}     |${value.nivel}     |${value.custo}")
            }

            var nivelEscolhido: Int

            do {
                print("Digite a opção: ")
                nivelEscolhido = readln().toInt() - 1

                if (nivelEscolhido < 0 || nivelEscolhido >= niveisDisponiveis.count()) {
                    println("Opção indisponível! Tente novamente...")
                    println("--------------------------------------")
                }
            } while (nivelEscolhido < 0 || nivelEscolhido >= niveisDisponiveis.count())

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

    fun rolarDadosIniciais() {
        var index = 0
        val dado = D6()

        val valoresGerados = mutableListOf<Int>()

        while (index < 6) {
            index++
            var dadoAtual: Int = 0
            val valores = mutableListOf<Int>()

            print("Pressione 'Enter' para rolar os dados...")
            readln()
            while (dadoAtual < 4) {
                valores.add(dado.rolarDado())
                dadoAtual++
            }

            println("Valores gerados:")
            for ((i, value) in valores.withIndex()) {
                println("${i + 1}° valor: $value")
            }

            valores.sort()
            valores.removeFirst()

            val soma = valores.sum()

            valoresGerados.add(soma)

            println("Soma dos 3 maiores valores: $soma")
            println("--------------------------------------")
        }

        println("Distribua cada valor para cada um dos atributos")
        println(valoresGerados.joinToString(separator = " | "))

        distribuirValores(valoresGerados)
    }

    fun distribuirPreDefinidosIniciais() {
        val valores = mutableListOf<Int>(15, 14, 13, 12, 10, 8)

        println("Distribua cada valor para cada um dos atributos")
        println(valores.joinToString(separator = " | "))

        distribuirValores(valores)
    }

    private fun distribuirValores(valores: MutableList<Int>) {
        for (valor in valores) {
            println("Para qual atributo deseja inserir o valor ${valor}?")

            val atributoEscolhido = escolherAtributo()

            melhorarNivelAtributo(atributosParaEscolher[atributoEscolhido].nome, valor)
            atributosParaEscolher.remove(atributosParaEscolher[atributoEscolhido])
        }
    }

    private fun escolherAtributo(): Int {
        println("Opção | Atributo")
        for ((i, value) in atributosParaEscolher.withIndex()) {
            println("${i + 1}     | ${value.nome}")
        }

        var atributoEscolhido: Int

        do {
            print("Digite a opção: ")
            atributoEscolhido = readln().toInt() - 1

            if (atributoEscolhido < 0 || atributoEscolhido >= atributosParaEscolher.count()) {
                println("Opção indisponível! Tente novamente...")
                println("--------------------------------------")
            }
        } while (atributoEscolhido < 0 || atributoEscolhido >= atributosParaEscolher.count())

        return atributoEscolhido
    }

    private fun melhorarNivelAtributo(nomeAtributo: String, novoNivel: Int) {
        when (nomeAtributo) {
            "Força" -> forca.nivelAtual = novoNivel
            "Destreza" -> destreza.nivelAtual = novoNivel
            "Constituição" -> constituicao.nivelAtual = novoNivel
            "Inteligência" -> inteligencia.nivelAtual = novoNivel
            "Sabedoria" -> sabedoria.nivelAtual = novoNivel
            "Carisma" -> carisma.nivelAtual = novoNivel
        }
    }
}