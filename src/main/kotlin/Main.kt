package org.example

import org.example.dado.D20
import org.example.personagem.Personagem
import org.example.personagem.classes.Patrulheiro
import org.example.personagem.racas.Elfo

fun main() {
    var d20 = D20()

    println(d20.rodarDado())
}