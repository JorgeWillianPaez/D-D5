package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class MeioOrc : IRaca {
    override var nome = "Meio-Orc"
    private val bonusForca = 2
    private val bonusConstituicao = 1

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.forca.nivelAtual += bonusForca
        personagem.constituicao.nivelAtual += bonusConstituicao
        return personagem
    }
}