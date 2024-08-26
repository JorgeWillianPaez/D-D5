package org.example.racas

import org.example.character.races.IRaca
import org.example.personagem.Personagem

class Halfing : IRaca {
    override var nome = "Halfing"
    private val bonusDestreza = 2

    override fun aplicarProficienciaInicial(personagem : Personagem): Personagem {
        personagem.destreza.nivelAtual += bonusDestreza
        return personagem
    }
}