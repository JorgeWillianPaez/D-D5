package org.example.character.races

import org.example.personagem.Personagem

interface IRaca {
    var nome: String
    fun aplicarProficienciaInicial(personagem : Personagem): Personagem
}