package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Gnomo : IRaca {
    override var nome = "Gnomo"
    private val bonusInteligencia = 2

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.inteligencia.bonusRaca = bonusInteligencia
        return personagem
    }
}