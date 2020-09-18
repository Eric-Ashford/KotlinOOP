package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)

fun main(){
    val person = Person("Koda", 14, "Male")
    println(" Name: ${person.name}\n Age: ${person.age}\n Gender: ${person.gender}")
}