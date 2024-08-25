package org.example.personagem

class Atributo(var nome: String, var nivelAtual: Int, var bonusRaca: Int, var bonusClasse: Int) {
    var detalhesNiveisCriacao = listOf(
        NivelAtributoDetalhes(9, 1, -1),
        NivelAtributoDetalhes(10, 2, 0),
        NivelAtributoDetalhes(11, 3, 0),
        NivelAtributoDetalhes(12, 4, 1),
        NivelAtributoDetalhes(13, 5, 1),
        NivelAtributoDetalhes(14, 7, 2),
        NivelAtributoDetalhes(15, 9, 2)
    )

    fun niveisDisponiveis(pontosDisponiveis: Int): MutableList<NivelAtributoDetalhes> {
        val opcoesDisponiveis = mutableListOf<NivelAtributoDetalhes>()
        for (objNivel in detalhesNiveisCriacao) {
            if (objNivel.nivel > nivelAtual && objNivel.custo <= pontosDisponiveis) {
                opcoesDisponiveis.add(objNivel)
            }
        }
        return opcoesDisponiveis
    }

    fun buscarModificadorAtual(): Int {
        return detalhesNiveisCriacao.filter { it.nivel == nivelAtual }[0].modificador
    }
}