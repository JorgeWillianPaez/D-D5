package org.example.personagem.classes

import org.example.character.classes.IClasse
import org.example.dado.D8

class Clerigo: IClasse {
    var dadoVida = D8()

    override fun rodarDadoVida(): Int {
        return this.dadoVida.rodarDado()
    }
}