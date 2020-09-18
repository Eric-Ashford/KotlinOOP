package com.car.maintain

//Kotlin makes a default constructor of the class within its arguments


class Car(){

    //Private default parameters
    var carType:String? = null
    var carMake:String? = null
    var carModel:String? = null
    var Price: Double? = null
    var owner:String? = "Unowned"
    var miles:Int? = 0

    constructor(carType:String, carMake: String, carModel: String, Price:Double, owner:String, miles:Int):this(){
        this.carType = carType
        this.carMake = carMake
        this.carModel = carModel
        this.Price = Price
        this.owner = owner
        this.miles = miles
    }

    constructor(carType:String, carMake: String, carModel: String, Price:Double):this(){
        this.carType = carType
        this.carMake = carMake
        this.carModel = carModel
        this.Price = Price
    }


    init{
        //println("This Object is created")
    }

    fun getCarPrice(): Double? {
        return this.Price!!.minus((this.miles!!.toDouble() * 2))
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

    val listOfCars:ArrayList<Car> = arrayListOf<Car>()
        listOfCars.add(Car("Sedan","Chevrolet", "Malibu", 23000.00, "Eric",2000))
        listOfCars.add(Car("Hatchback", "Dodge", "Caliber", 5000.00))

    for(car in listOfCars){
        println("Owner: ${car.owner}")
        println("Car: ${car.carMake} ${car.carModel}")
        println("Price: ${car.getCarPrice()}\n")
    }
}
