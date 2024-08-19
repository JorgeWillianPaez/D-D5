package org.example.dado

import kotlin.random.Random

class D4 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(5)
        return random
    }
}