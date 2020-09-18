import java.util.*
import kotlin.collections.ArrayList

//Comparable is sorting objects

class Person(var name:String, var age:Int): Comparable<Person>{

    override fun compareTo(other: Person): Int {
        return this.age - other.age                 //Ascending Order
        //return other.age - this.age               //Descending Order
    }
}


fun main(args:Array<String>){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("Koda", 25))
    listOfNames.add(Person("Ness", 16))
    listOfNames.add(Person("Kiala", 22))

    println("Before Sort")
    for(person in listOfNames){
        println("Name: ${person.name}")
        println("Age: ${person.age}")
        println()
    }

    println("\nAfter Sort")
    listOfNames.sort()                                  //or Collections.sort(arrayListName)
    for(person in listOfNames){
        println("Name: ${person.name}")
        println("Age: ${person.age}")
        println()
    }

    println("======================================Program End========================================")

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Before Sort
Name: Koda
Age: 25

Name: Ness
Age: 16

Name: Kiala
Age: 22


After Sort
Name: Ness
Age: 16

Name: Kiala
Age: 22

Name: Koda
Age: 25

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */