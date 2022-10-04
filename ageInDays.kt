fun main(){
  print("How old are you? (age, months and days separated by spaces) ")
  val age = readln()
  val mappedAge = age.split(" ").map({ it.toInt() })
  if (mappedAge.count() == 3){
    try{
      if(mappedAge.any({ it < 0 })){
        println("The numbers don't add up.")
        main()
      } else {
        // Pretending every year is 365 days long and every month is 30 days long, for simplicity's sake.
        // Hope you don't mind. :)
        println("You are ${mappedAge[0] * 365 + mappedAge[1] * 30 + mappedAge[2]} days old")
        println("(${mappedAge[0]} years, ${mappedAge[1]} months and ${mappedAge[2]} days)")
      }
    } catch (e: NumberFormatException) {
        println("Only integers allowed !")
    }
  } else {
      println("I can only do the math if you enter years, months and days in the format I asked :(")
      main()
  }
}