package com.example.buildings



open class BaseBuildingMaterial (var numberNeeded : Int = 1)

class Wood : BaseBuildingMaterial (numberNeeded = 4)

class Brick : BaseBuildingMaterial (numberNeeded = 8)


class Building<T : BaseBuildingMaterial>(var buildingMaterial: T, var baseMaterialNeeded: Int = 100) {
    var actualMaterialsNeeded = baseMaterialNeeded + buildingMaterial.numberNeeded

    fun build() {
        println ("Need a total of ${actualMaterialsNeeded} of ${buildingMaterial::class.simpleName}")
    }

}


fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if(building.actualMaterialsNeeded < 500)
        println("small building")
    else
        println("large building")
}


fun main() {
    var building = Building(Wood())
    building.build()
    isSmallBuilding(building)


     for(i in 1..9)
         labeled_break_example@ for(j in 1..9) {
            if (j > 5)
                break@labeled_break_example
            println("[${i}][${j}]: ${i * j}")
        }
}