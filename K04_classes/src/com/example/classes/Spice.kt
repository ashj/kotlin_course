package com.example.classes

abstract class Spice (val name: String, val spiciness : String = "mild", color: SpiceColor): SpiceColor by color {
    val heat : Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
        }
    }

    abstract fun prepareSpice()
}

class Curry(spiciness: String = "mild", color: SpiceColor = YellowSpiceColor): Spice(name = "Curry", spiciness = spiciness, color = color), Grinder {

    override fun prepareSpice() {
        println ("Preparing the $color spice.")
        grind()
    }

    override fun grind() {
        println ("    Grinding it.")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}
object YellowSpiceColor: SpiceColor {
    override val color: String = "yellow"

}



fun main() {
    var curry = Curry()
    curry.prepareSpice()
}