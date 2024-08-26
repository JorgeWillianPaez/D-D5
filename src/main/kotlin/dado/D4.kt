package org.example.dado

import kotlin.random.Random

class D4 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 5)
        return random
    }
}