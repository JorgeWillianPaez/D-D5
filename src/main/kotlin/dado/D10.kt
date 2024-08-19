package org.example.dado

import kotlin.random.Random

class D10 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(11)
        return random
    }
}