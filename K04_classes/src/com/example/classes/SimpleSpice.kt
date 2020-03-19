package com.example.classes

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    var heat: Int = 0
         get() = if (spiciness == "mild") 5 else 0
}


fun main() {
    var mySpice = SimpleSpice()
    println ("Check the spice: ${mySpice.heat}")
}