package org.example.dado

import kotlin.random.Random

class D10 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 11)
        return random
    }
}