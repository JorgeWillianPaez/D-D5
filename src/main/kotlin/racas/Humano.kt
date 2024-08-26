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
        personagem.forca.nivelAtual += bonusForca
        personagem.destreza.nivelAtual += bonusDestreza
        personagem.constituicao.nivelAtual += bonusConstituicao
        personagem.inteligencia.nivelAtual += bonusInteligencia
        personagem.sabedoria.nivelAtual += bonusSabedoria
        personagem.carisma.nivelAtual += bonusCarisma
        return personagem
    }
}