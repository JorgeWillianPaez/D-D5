package org.example.dado

import kotlin.random.Random

class D12 : IDado {
    override fun rolarDado(): Int {
        val random = Random.nextInt(1, 13)
        return random
    }
}