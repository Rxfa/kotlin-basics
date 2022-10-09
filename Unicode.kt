fun main(){
  print("Símbolo? ")
  val arg = readln()
  println(" O símbolo ${arg[0]} tem o código ${arg[0].code} = ${arg[0].code.toString(2)}.")
}