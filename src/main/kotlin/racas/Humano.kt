package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Humano : IRaca {
    override var nome = "Humano"
    private val bonusForca = 1
    private val bonusDestreza = 1
    private val bonusConstituicao = 1
    private val bonusInteligencia = 1
    private val bonusSabedoria = 1
    private val bonusCarisma = 1

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.forca.bonusRaca = bonusForca
        personagem.destreza.bonusRaca = bonusDestreza
        personagem.constituicao.bonusRaca = bonusConstituicao
        personagem.inteligencia.bonusRaca = bonusInteligencia
        personagem.sabedoria.bonusRaca = bonusSabedoria
        personagem.carisma.bonusRaca = bonusCarisma
        return personagem
    }
}