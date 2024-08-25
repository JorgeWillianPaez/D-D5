package org.example.character.classes

import org.example.personagem.Personagem

interface IClasse {
    var nome: String
    fun rolarDadoVida(): Int
    fun aplicarProficienciaInicial(personagem : Personagem): Personagem
}