package com.example.essentials.practice

// Extension on class String. Method called is hasSpace
fun String.hasSpace() : Boolean {
    return find { it == ' ' } != null
}

fun runOP(p1: Int, p2: Int, operation: (Int, Int) -> Int) : Int {
    return operation(p1, p2)
}



class Extensions {

}


fun main() {
    println("HelloWorld".hasSpace())
    println(runOP(10, 30) { a, b -> a*b
    })

}