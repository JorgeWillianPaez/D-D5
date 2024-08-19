package org.example.personagem.classes

import org.example.character.classes.IClasse
import org.example.dado.D6

class Mago: IClasse {
    var dadoVida = D6()

    override fun rodarDadoVida(): Int {
        return this.dadoVida.rodarDado()
    }
}