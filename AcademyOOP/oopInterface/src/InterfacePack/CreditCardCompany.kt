package InterfacePack
//Interface is a way to design code to allow behaviors to be implemented to more then one class that will share that
// behavior

interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber:String):CreditCard{

    override fun score(age:Int){
        if(age > 50){
            println("Negative")
        } else{
            println("Positive")
        }
    }
}

class VisaCard(override val cardNumber: String):CreditCard{

    override fun score(age:Int){
        if(age > 60){
            println("Negative")
        } else{
            println("Positive")
        }

    }
}


class Paypal(client:CreditCard):CreditCard by client{

    fun print(){
        println(this.cardNumber)
    }
}


fun main(){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    val visa = VisaCard("999999999999999999999")
    visa.score(50)

    val payPal1 = Paypal(visa)
    payPal1.print()

    val master = MasterCard("111111111111111111111")
    master.score(60)

    val payPal2 = Paypal(master)
    payPal2.print()


    println("======================================Program End========================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Positive
999999999999999999999
Negative
111111111111111111111

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */