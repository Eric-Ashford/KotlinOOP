//Enum classes are a easy way to have group a collection of data for easy use

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    var userDirection = Direction.SOUTH

    if (userDirection == Direction.NORTH){
        println("User is heading North")
    } else if(userDirection == Direction.SOUTH){
        println("User is heading South")
    } else if(userDirection == Direction.EAST) {
        println("User is heading East")
    } else if(userDirection == Direction.WEST){
        println("User is heading West")
    } else{
        println("User is Lost!!!!!")
    }

    println("======================================Program End========================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

User is heading South

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */