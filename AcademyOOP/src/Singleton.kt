//Singleton is used to call a instance of a class for a object without having to reinstantiate a class.
    //By Eric Ashford


    class Singleton{
        var name:String?=null

        private constructor(){
            println("Instance is created")
        }

        companion object{
            val instance:Singleton by lazy{ Singleton() }
        }
    }

    fun main(args:Array<String>) {
        println("======================================Program Start=====================================")

        var s1 = Singleton.instance
        s1.name = "Koda"
        println(s1.name)

        var s2 = Singleton.instance
        println(s2.name)

        var s3 = Singleton.instance
        println(s3.name)

        println("======================================Program End========================================")
    }

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Instance is created
Koda
Koda
Koda

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */