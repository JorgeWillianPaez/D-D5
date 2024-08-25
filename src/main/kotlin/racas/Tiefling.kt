package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Tiefling : IRaca {
    override var nome = "Anão"
    private val bonusInteligencia = 1
    private val bonusCarisma = 2

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.inteligencia.bonusRaca = bonusInteligencia
        personagem.carisma.bonusRaca = bonusCarisma
        return personagem
    }
}