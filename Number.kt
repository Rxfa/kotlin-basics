fun main(){
  print("Número positivo? ")
  val num = readln()
  println("$num é multiplo de 3 == ${num.toInt() % 3 == 0}")
  println("$num tem ${num.length} digitos")
  println("${num.first()} e ${num.last()} são pares == ${ listOf(num.first(), num.last()).any({ it.code % 2 == 0}) }")
  println("${num.first()} - ${num.last()} == ${num.first().code - num.last().code}")
}