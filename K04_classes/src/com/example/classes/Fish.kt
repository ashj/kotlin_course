package com.example.classes

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }
    constructor(): this(friendly = true, volumeNeeded = 9) {
        println ("Running secondary constructor")
    }
    init {

        if (friendly) {
            size = volumeNeeded
        }
        else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructor of fish size: $volumeNeeded final size: ${this.size}")
    }

    init {
        println("last init block")
    }
}
fun makeDefaultFish() = Fish(true, 50)

fun main() {
    val fish = Fish (true, 20)
    println("Friendly? ${fish.friendly}. It needs volume: ${fish.size}")
}