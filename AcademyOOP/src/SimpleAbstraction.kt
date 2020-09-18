//Abstract means no one can extract data from the class or methods unless there is a class that inherits from it
//Methods will have to be overridden to be used if abstract methods

abstract class CreditCard(){
    val creditScore:Int = 780

    fun returnCreditID():String{
        return "321654987abc"
    }

    abstract fun returnCreditScore()
}

class UserInfo(): CreditCard(){
    fun getUserInfo():String{
        return returnCreditID()
    }

    override fun returnCreditScore() {
        println("Credit score is $creditScore")
    }
}


fun main(){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    //Wont work due to abstraction
    //var credit = CreditCard()
    //println(credit.returnCreditID())

    var user = UserInfo()
    println(user.getUserInfo())
    user.returnCreditScore()


    println("======================================Program End========================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

321654987abc
Credit score is 780

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */