package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Anao : IRaca {
    override var nome = "Anão"
    private val bonusConstituicao = 2

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.constituicao.nivelAtual += bonusConstituicao
        return personagem
    }
}