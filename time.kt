fun main(){
  try{
    print("Enter time(h:m:s): ")
    val time = readln().split(":").map({ it.toInt() })
    if(time.count() == 3 && time.all({it >= 0})){
      print("Time is ${time[0] * 3600 + time[1] * 60 + time[2]}")
    } else {
      println("You must enter 3 non-negative numbers")
      main()
    }
  } catch(e: NumberFormatException){
    println("Please enter the numbers in the asked format")
    main()
  }
}