package org.example.dado

open class Dado(var dado : IDado) {
    fun rodarDado(): Int {
        return this.dado.rodarDado()
    }
}