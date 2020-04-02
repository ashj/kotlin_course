package com.example.aquarium.generics

open class WaterSupply (var needsProcessed: Boolean)

class TapWater : WaterSupply (true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply (false)

class LakeWater : WaterSupply (true) {
    fun filter() {
        needsProcessed = false
    }
}


class Aquarium <T> (val waterSupply: T) // T is anything, including null
class Aquarium2<T : Any?> (val waterSupply: T) // T is anything, including null
class Aquarium3<T : Any > (val waterSupply: T) // T is anything, EXCLUDING null
class Aquarium4<T : WaterSupply > (val waterSupply: T) { // T is anything, EXCLUDING null
    fun addWater() {
        check(!waterSupply.needsProcessed) {
            "water supply needs processing."
        }
        println ("adding water from $waterSupply")
    }
}
fun main() {
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    Aquarium2(null)
    //Aquarium3(null) // error at compile time

    val aquarium4 = Aquarium4(LakeWater())
    //aquarium4.addWater()
    aquarium4.waterSupply.filter()
    aquarium4.addWater()

}