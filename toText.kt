fun main(){
  print("Enter list elements (separated by spaces): ")
  val listOfStr = readln().split(" ")
  run {
    println(listOfStr.toText())
  }
}

fun List<String>.toText(): String{
  return this.joinToString(",")
}