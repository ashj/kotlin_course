package com.example.classes

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {


    //fun volume() = width * height * length / 1000

//    val volume : Int
//        get() {
//            return width * height * length / 1000
//    }

    // Getter and setter, with optional private for the setter
    open var volume : Int
        get() = width * height * length / 1000
        /* private */ set (value) { height = (value * 1000) / (width * length)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank(): Aquarium() {
    override var water = volume * 0.80

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }

}