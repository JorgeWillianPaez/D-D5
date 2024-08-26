package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class MeioElfo : IRaca {
    override var nome = "Meio-Elfo"
    private val bonusCarisma = 2

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.carisma.nivelAtual += bonusCarisma
        return personagem
    }
}