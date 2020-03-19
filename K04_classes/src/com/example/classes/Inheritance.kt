package com.example.classes

fun main (args: Array<String>) {
    delegate()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}


class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by fishColor {
    override fun eat() {
        println ("yum!")
    }

}

class GoldFish: FishAction, FishColor by GoldColor {
    override fun eat() {
        println ("eat algae")
    }

}

object RedColor: FishColor {
    override val color = "red"

}



class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }

}

class EaterFish(fishColor: FishColor = RedColor): FishAction by PrintingFishAction("a lot of algae"), FishColor by fishColor {

}

fun delegate() {
    var goldFish = GoldFish()
    goldFish.eat()
    println ("color: ${goldFish.color}")

    var plecostomus1 = Plecostomus()
    plecostomus1.eat()
    println ("color: ${plecostomus1.color}")

    var plecostomus2 = Plecostomus(RedColor)
    plecostomus2.eat()
    println ("color: ${plecostomus2.color}")


    var eaterFish = EaterFish(RedColor)
    eaterFish.eat()
    println ("color: ${eaterFish.color}")
}