package com.example.classes

fun main (args: Array<String>) {
    buildAquarium()

}

// private vs internal

fun buildAquarium() {
    val myAquarium = Aquarium()

    println ("The volume is ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println ("Small aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Aquarium2: ${myAquarium2.volume} liters with length: ${myAquarium2.length}, width: ${myAquarium2.width}," +
        " height: ${myAquarium2.height}")
}