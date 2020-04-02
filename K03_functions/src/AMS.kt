import java.util.*

fun main(args: Array<String>) {
    println ("Hello world!")

    feedTheFish()

    //println ("Can add fish? ${canAddFish(10.0, listOf(3,3,3))}")
    //println ("Can add fish? ${canAddFish(8.0, listOf(2,2,2), hasDecorations = false)}")
    //println ("Can add fish? ${canAddFish(9.0, listOf(1,1,3), 3)}")
    //println ("Can add fish? ${canAddFish(10.0, listOf(), 7, true)}")
    hello()
    print ("The sum lambda call: ${sum(3, 7)}")
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food.")

    if (shouldChangeWater(day)) {
        println ("Change the water today")
    }

    //dirtyProcessor()
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "plankton"
        //"Saturday" -> "flakes" // removed to allow else to execute
        //"Sunday" -> "flakes"
        else -> "fasting"
    }
}

fun shouldChangeWater (
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()) : Boolean {

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot (temperature: Int) = temperature > 30
fun isDirty (dirty: Int) = dirty > 30
fun isSunday (day: String) =  day == "Sunday"

fun getDirtySensorReading() = 20

fun canAddFish (
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true) : Boolean {

    var currentTotalFish = fishSize + currentFish.sum()
    var usableTankSize = tankSize
    if (hasDecorations)
        usableTankSize *= 0.80

    return usableTankSize >= currentTotalFish.toDouble()
}


//lambda
val hello = { println ("HELLO") }
val sum = { a: Int, b: Int -> a+b }
val sum2: (Int, Int) -> Int = { a, b -> a+b }



val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int {
    return operation (dirty)
}


//fun dirtyProcessor() {
//    dirty = updateDirty(dirty, waterFilter) // lambda
//    dirty = updateDirty(dirty, ::feedFish) // not a lambda
//    dirty = updateDirty(dirty, {dirty -> dirty + 5 } ) // passing a lambda
//    dirty = updateDirty(dirty) {dirty -> dirty + 5 }  // passing a lambda 2
//}