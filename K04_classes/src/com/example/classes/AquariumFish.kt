package com.example.classes

abstract class AquariumFish {
    abstract val color: String
}


class Shark: Aquarium() {

    val color = "gray"
}