fun main(){
  print("Enter scale: ")
  val scale = readln()
  print("Enter temperature: ")
  try {
    val temp = readln().toDouble()
  }
  catch(e: NumberFormatException) {
    println("You must enter a Double !")
    main()
  }
  val result = conversion(scale, temp) 
  println(result)
}

fun conversion(scale:String, temp:Double):String{
  val celsius = (temp - 32)*5/9
  val fahrenheit = temp * 9/5 + 32
  return{
    when(scale){
      "celsius" -> "$temp º in celsius equals $fahrenheit º in Fahrenheit"
      "fahrenheit" -> "$temp º in fahrenheit equals $celsius º in celsius"
      else -> "wrong scale. :)"
      }
    } 
}