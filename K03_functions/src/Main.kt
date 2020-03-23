fun main(args: Array<String>) {
    println ("Hello World")
    var birthday: Int
    var fortune: String
    for (i in 1..10) {
        birthday = getBirthday()
        fortune = getFortuneCookie(birthday)
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy"))
            break
    }
}

fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    //return fortunes[birthday.rem(fortunes.size)]
    return when(birthday) {
        in 1..7 -> fortunes[1]
        28, 31  -> fortunes[5]
        else -> fortunes[0]
    }
}

fun getBirthday() :  Int {
    print ("Enter your birth day: ")

    var birthday = readLine()?.toIntOrNull() ?: 1
    if (birthday < 1 || birthday > 31)
        birthday = 1

    println ("Your birthday on day ${birthday}")

    return birthday
}