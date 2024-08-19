package org.example.personagem.classes

import org.example.character.classes.IClasse
import org.example.dado.D12

class Barbaro : IClasse {
    var dadoVida = D12()

    override fun rodarDadoVida(): Int {
        return this.dadoVida.rodarDado()
    }
}