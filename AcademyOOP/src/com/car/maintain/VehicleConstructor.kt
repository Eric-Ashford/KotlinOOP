package com.car.maintain
//Kotlin makes a default constructor of the class within its arguments
//Public All class parameters are visible
//Private Hides all parameters from outside the class even the inherited members
//Protected allows for inherited classes to modify and access the data
//Super is used to call functions and parameters from parent classes
//Casting is converting one class to another class

open class VehicleConstructor(){

    //Default parameters
    private var Price: Double? = 00.00
    var vehicleType:String? = null
    var carMake:String? = null
    var carModel:String? = null
    var owner:String? = "Unowned"
    var miles:Int? = 0

    constructor(vehicleType:String, carMake: String, carModel: String, Price:Double, owner:String, miles:Int):this(){
        this.vehicleType = vehicleType
        this.carMake = carMake
        this.carModel = carModel
        this.Price = Price
        this.owner = owner
        this.miles = miles
    }

    constructor(vehicleType:String, carMake: String, carModel: String, Price:Double):this(){
        this.vehicleType = vehicleType
        this.carMake = carMake
        this.carModel = carModel
        this.Price = Price
    }


    init{
        //println("This Object is created")
    }

    open fun getCarPrice(): Double? {
        return getPrice().minus(this.miles!!.toDouble() * 1.2)
    }

    fun getPrice():Double{
        return this.Price!!
    }
}

fun main(){

    /*
    val car1 = Car("Sedan","Chevrolet", "Malibu", 23000.00, "Eric",2000)
    val car2 = Car("Coupe", "Yes", "Yes", 5000.00, "Idk", 2000)


    println("Car 1")
    println("Owner: ${car1.owner}")
    println("Car: ${car1.carMake} ${car1.carModel}")
    println("Price: ${car1.getCarPrice()}")


    println("\nCar 2")
    println("Owner: ${car2.owner}")
    println("Car: ${car2.carMake} ${car2.carModel}")
    println("Price: ${car2.getCarPrice()}")
    */

    val listOfCars:ArrayList<VehicleConstructor> = arrayListOf()
    listOfCars.add(VehicleConstructor("Sedan","Chevrolet", "Malibu", 23000.00, "Eric",2000))
    listOfCars.add(VehicleConstructor("Hatchback", "Dodge", "Caliber", 5000.00))

    for(car in listOfCars){
        println("Owner: ${car.owner}")
        println("Car: ${car.carMake} ${car.carModel}")
        println("Price: ${car.getCarPrice()}\n")
    }
}
