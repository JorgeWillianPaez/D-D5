package org.example.dado

import kotlin.random.Random

class D20 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(21)
        return random
    }
}