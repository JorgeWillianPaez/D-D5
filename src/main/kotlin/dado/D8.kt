package org.example.dado

import kotlin.random.Random

class D8 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(9)
        return random
    }
}