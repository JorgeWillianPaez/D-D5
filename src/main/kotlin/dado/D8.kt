package org.example.dado

import kotlin.random.Random

class D8 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 9)
        return random
    }
}