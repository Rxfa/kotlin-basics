fun main(){
  print("enter n: ")
  val input = readln().trim().toInt()
  print("enter list elements(separated by spaces): ")
  run{
    println(readln().split(" ").map { it.toInt() }.averageOfBest(input))
  }
}

fun List<Int>.averageOfBest(n: Int): Float{
  return when {
    n > 0 && this.size > 0 -> this.sorted().takeLast(n).average().toFloat()
    else -> 0F
  }
}