package org.example.personagem

class Atributo(var nome: String, var nivelAtual: Int, var bonusRaca: Int, var bonusClasse: Int) {
    var detalhesNiveis = listOf(
        NivelAtributoDetalhes(1, 0, -5),
        NivelAtributoDetalhes(2, 0, -4),
        NivelAtributoDetalhes(3, 0, -4),
        NivelAtributoDetalhes(4, 0, -3),
        NivelAtributoDetalhes(5, 0, -3),
        NivelAtributoDetalhes(6, 0, -2),
        NivelAtributoDetalhes(7, 0, -2),
        NivelAtributoDetalhes(8, 1, -1),
        NivelAtributoDetalhes(9, 1, -1),
        NivelAtributoDetalhes(10, 2, 0),
        NivelAtributoDetalhes(11, 3, 0),
        NivelAtributoDetalhes(12, 4, 1),
        NivelAtributoDetalhes(13, 5, 1),
        NivelAtributoDetalhes(14, 7, 2),
        NivelAtributoDetalhes(15, 9, 2),
        NivelAtributoDetalhes(16, 0, 3),
        NivelAtributoDetalhes(17, 0, 3),
        NivelAtributoDetalhes(18, 0, 4),
        NivelAtributoDetalhes(19, 0, 4),
        NivelAtributoDetalhes(20, 0, 5),
    )

    fun niveisDisponiveis(pontosDisponiveis: Int): MutableList<NivelAtributoDetalhes> {
        val opcoesDisponiveis = mutableListOf<NivelAtributoDetalhes>()
        for (objNivel in detalhesNiveis) {
            if (objNivel.nivel > nivelAtual && objNivel.custo <= pontosDisponiveis && objNivel.nivel >= 8 && objNivel.nivel <= 15) {
                opcoesDisponiveis.add(objNivel)
            }
        }
        return opcoesDisponiveis
    }

    fun buscarModificadorAtual(): Int {
        return detalhesNiveis.filter { it.nivel == nivelAtual }[0].modificador
    }
}