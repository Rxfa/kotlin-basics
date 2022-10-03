/*
 * 2nd version of TwoValues.kt
 * Added error handling
 */

fun main(){
    try{
        print("A?")
        val A = readln().toInt()
        print("B?")
        val B = readln().toInt()
        println("A < B == ${A < B}")
        println("A + B == ${A + B}")
        println("A - B == ${A - B}")
        println("A x B == ${A * B}")
        println("A / B == ${A.toDouble() / B.toDouble()}")   
    }   catch (e: NumberFormatException) {
            println("Only Integers are accepted!")
        main()
    }
}