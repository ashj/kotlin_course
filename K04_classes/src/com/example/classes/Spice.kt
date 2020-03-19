package com.example.classes

class Spice (val name: String, val spiciness : String = "mild") {
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
}
fun makeSalt() = Spice ("salt")

fun main() {
    val spices1 = mutableListOf<Spice>(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")

    spices1.add(spice)
    spices1.add(makeSalt())
    val spicelist = spices1.filter {it.heat < 5}

    for (item in spicelist) {
        println(item.name)
    }
}