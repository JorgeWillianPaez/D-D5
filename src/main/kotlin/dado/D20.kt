package org.example.dado

import kotlin.random.Random

class D20 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 21)
        return random
    }
}