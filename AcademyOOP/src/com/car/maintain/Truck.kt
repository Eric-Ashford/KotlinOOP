package com.car.maintain

class Truck:VehicleConstructor{
    var subType:String? = null

    constructor(vehicleType:String, carMake:String, carModel:String, Price:Double, owner:String, miles:Int, subType:String):
            super(vehicleType, carMake, carModel, Price, owner, miles){

        this.subType = subType
    }

    constructor(vehicleType:String, carMake: String, carModel: String, Price:Double, subType: String):
            super(vehicleType, carMake, carModel, Price){

        this.subType = subType
    }

    override fun getCarPrice():Double{
        return getPrice().minus(this.miles!!.toDouble() * .8)
    }

}

//Extension - Notice this is outside of the class
fun Truck.getCarPriceWrapper():Double?{
    return this.getCarPrice()
}

fun main(){
    val truck1 = Truck("Truck","Ford", "F-150", 28745.00, "Eric", 2000, "Pickup")
    val truck2 = Truck("Truck","Nissan", "Frontier", 26790.00, "Unowned", 15000, "Pickup")
    val truck3 = Truck("Truck","Ford", "Explorer", 26050.00, "Unowned", 23000, "SUV")

    println("${truck1.vehicleType} 1")
    println("Owner: ${truck1.owner}")
    println("Car: ${truck1.carMake} ${truck1.carModel}")
    println("Miles: ${truck1.miles}")
    println("Price: ${truck1.getCarPrice()}")
    println("Parent Price: ${truck1.getCarPriceWrapper()}")

    println("\n${truck2.vehicleType} 2")
    println("Owner: ${truck2.owner}")
    println("Car: ${truck2.carMake} ${truck2.carModel}")
    println("Miles: ${truck2.miles}")
    println("Price: ${truck2.getCarPrice()}")
    println("Parent Price: ${truck1.getCarPriceWrapper()}")

    println("\n${truck3.vehicleType} 3")
    println("Owner: ${truck3.owner}")
    println("Car: ${truck3.carMake} ${truck3.carModel}")
    println("Miles: ${truck3.miles}")
    println("Price: ${truck3.getCarPrice()}")
    println("Parent Price: ${truck1.getCarPriceWrapper()}")
}