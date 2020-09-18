//Generics are a way to define classes, methods and properties using different data types to keep track of
// compile-type safety by using a placeholder type. <T>

class UserAdmins<T>(credit:T){
    init {
        println(credit)
    }
}

fun<T> display(process:T){
    println(process)
}

fun main(args:Array<String>){
    var userAdmins = UserAdmins<String>("Koda")
    var userAdmins2 = UserAdmins<Int>(487)

    display<Int>(22)
    display<String>("Processing...")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Koda
487
22
Processing...

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */