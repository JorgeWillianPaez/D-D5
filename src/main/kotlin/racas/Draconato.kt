package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Draconato : IRaca {
    override var nome = "Draconato"
    private val bonusForca = 2
    private val bonusCarisma = 1

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.forca.nivelAtual += bonusForca
        personagem.carisma.nivelAtual += bonusCarisma
        return personagem
    }
}