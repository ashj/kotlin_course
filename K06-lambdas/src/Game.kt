class Game() {
    var path = mutableListOf<Directions> (Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        println ("GAME OVER: $path")
        path.clear()
        false
    }

    fun makeMove(move: String?) {
        when (move?.toLowerCase()) {
            "north" -> move(north)
            "south" -> move(south)
            "east" -> move(east)
            "west" -> move(west)
            "end" -> move(end)
            else -> println ("Huh?")
        }
    }
}

// receives a no-parameter lambda
fun move(where: () -> Boolean ) {
    where.invoke()
}

// String.() -- the receiver object
// block is the name of the parameter
fun myWith(name: String, block: String.() -> Any) {
    name.block()
}

//EX2

//Create an extension on List using a higher order function that returns
// all the numbers in the list that are divisible by 3.
// Start by creating an extension function on List that takes an lambda on Int
// and applies it to each item in the list. When the lambda returns zero, include the item in the output.
// For example, this list:
// val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
//Should return
//> [3, 6, 9, 0]
//fun List<Int>.divisibleBy(block: (Int) -> Int) : List<Int> {
//    val result = mutableListOf<Int>()
//    for (item in this) {
//        if (block(item) == 0) {
//            result.add(item)
//        }
//    }
//    return result
//}

fun main() {
    val game = Game()
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)



    game.makeMove("north")
    game.makeMove("south")
    game.makeMove("east")
    game.makeMove("west")
    game.makeMove("null")
    game.makeMove(null)
    game.makeMove("end")
    println(game.path)

    myWith("hello") {
        println(capitalize())
    }

    //EX2

    //Create an extension on List using a higher order function that returns
    // all the numbers in the list that are divisible by 3.
    // Start by creating an extension function on List that takes an lambda on Int
    // and applies it to each item in the list. When the lambda returns zero, include the item in the output.
    // For example, this list:
    //val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    //Should return
    //> [3, 6, 9, 0]
    //println(numbers.divisibleBy { it.rem(3) })

}