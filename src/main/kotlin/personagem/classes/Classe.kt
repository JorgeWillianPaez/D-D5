package org.example.personagem.classes

import org.example.character.classes.IClasse

open class Classe(var classe: IClasse) {
    fun rodarDadoVida(): Int {
        return this.classe.rodarDadoVida()
    }
}