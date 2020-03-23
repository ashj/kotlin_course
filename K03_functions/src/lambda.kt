import java.util.*

fun main() {
    val rollDice = { faces: Int ->
        when (faces) {
            0 -> 0
            else -> Random().nextInt(faces) + 1
        }
    }

    val rollDice2: (Int) -> Int = {
        if (it == 0) 0
        else Random().nextInt(it) + 1
    }

    println ("Rolling the dice: ${rollDice2(12)}")
}