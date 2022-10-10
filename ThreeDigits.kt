fun main(){
  print("Número com 3 dígitos? ")
  val num = readln()
  println("O número $num ao contrário é ${num.reversed()}")
  println("""A soma dos dígitos $num é ${num.map{ "$it".toInt() }.sum() }""")
}