fun main() {
    println (whatShouldIDoToday("ok", temperature = 44))
    filters()
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        moodForWalk (mood, weather, temperature) -> "go for a walk"
        moodForStayInBed (mood, weather, temperature) -> "stay in bed"
        moodForSwimming (mood, weather, temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun moodForWalk(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny"
fun moodForStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun moodForSwimming(mood: String, weather: String, temperature: Int) = temperature > 35



fun filters() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }

    println ("Filtered curries: $curries")
}