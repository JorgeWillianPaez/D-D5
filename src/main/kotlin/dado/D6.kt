package org.example.dado

import kotlin.random.Random

class D6 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(7)
        return random
    }
}