package org.example.personagem.classes

import org.example.character.classes.IClasse
import org.example.dado.D10

class Paladino: IClasse {
    var dadoVida = D10()

    override fun rodarDadoVida(): Int {
        return this.dadoVida.rodarDado()
    }
}