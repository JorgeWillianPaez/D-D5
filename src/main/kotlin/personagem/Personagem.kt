package org.example.personagem

import org.example.character.classes.IClasse
import org.example.character.races.IRaca

class Personagem(var raca : IRaca, var classe : IClasse) {
    private var nome : String = ""
    private var nivel : Int = 1
    private var xp : Double = 0.0
    private var vida : Int = 0
    private var pontosDeAtributos = 0

    private var forca : Int = 0
    private var destreza : Int = 0
    private var contituicao : Int = 0
    private var inteligencia : Int = 0
    private var sabedoria : Int = 0
    private var carisma : Int = 0

    fun criarPersonagem(nome : String) {
        this.nome = nome
        this.vida = classe.rodarDadoVida()
    }

    fun escolherAtributosIniciais() {

    }

    fun gerarAtributosIniciais() {

    }
}