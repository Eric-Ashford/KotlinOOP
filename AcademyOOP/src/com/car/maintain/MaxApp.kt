package com.car.maintain
//Example of how we can use extensions


fun ArrayList<Int>.findMax():Int{
    var maxNum: Int = 0
    for(item in this){
        if(item > maxNum){
            maxNum = item
        }
    }
    return maxNum
}

fun main(){
    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(1)
    listOfElements.add(2)
    listOfElements.add(3)
    listOfElements.add(4)

    for(item in listOfElements){
        println(item)
    }

    println("\nMax: ${listOfElements.findMax()}")
}