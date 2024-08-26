package org.example.classes

import org.example.character.classes.IClasse
import org.example.dado.D12
import org.example.personagem.Personagem

class Barbaro: IClasse {
    override var nome = "Bárbaro"
    private val dadoVida = D12()
    private val forca = 2

    override fun rolarDadoVida(): Int {
        return this.dadoVida.rolarDado()
    }

    override fun aplicarProficienciaInicial(personagem: Personagem): Personagem {
//        personagem.forca.modificador += forca
        return personagem
    }
}