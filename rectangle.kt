fun main(){
  print("Enter heigth: ")
  val height = readln().toInt()
  print("Enter width: ")
  val width = readln().toInt()
  if(height > 0 && width > 0){
    println("The area of the rectangle equals ${height * width}")
  } else {
    println("Both width and height have be positive.")
    main()
  }
}