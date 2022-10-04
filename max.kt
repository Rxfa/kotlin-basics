fun main(){
  print("enter 3 numbers: (separated by spaces)")
  val list = readln().split(" ").map({it.toInt()})
  if(list.count() == 3){
    try{
      println(list.max())
    } catch (e: NumberFormatException){
      println("You must enter three numbers!")
      main()
    }
  } else {
    println("I need 3 numbers to run")
    main()
  }
}