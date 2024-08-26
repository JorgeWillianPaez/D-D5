package org.example.dado

import kotlin.random.Random

class D6 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 7)
        return random
    }
}