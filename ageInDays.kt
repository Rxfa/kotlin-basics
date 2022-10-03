fun main(){
  print("How old are you? (age, months and days separated by spaces) ")
  val age = readln()
  val parts = age.split(" ")
  if (parts.count() == 3){
    // map function didn't work for some reason
    try{
      if(parts[0].toInt() < 0 || parts[1].toInt() < 0 || parts[2].toInt() < 0){
        println("The numbers don't add up.")
        main()
      }
    } catch (e: NumberFormatException) {
        println("Only integers allowed !")
        main()
    }
    // Pretending every year is 365 days long and every month is 30 days long, for simplicity's sake.
    // Hope you don't mind. :)
    println("You are ${parts[0].toInt() * 365 + parts[1].toInt() * 30 + parts[2].toInt()} days old")
    println("(${parts[0]} years, ${parts[1]} months and ${parts[2]} days)")
  } else {
      println("I can only do the math if you enter years, months and days in the format I asked :(")
      main()
  }
}