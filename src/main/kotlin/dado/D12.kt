package org.example.dado

import kotlin.random.Random

class D12 : IDado {
    override fun rodarDado(): Int {
        val random = Random.nextInt(13)
        return random
    }
}