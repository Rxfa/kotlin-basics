fun main(){
  print("Introduza um numero inteiro: ")
  val num = readln().toInt()
  println(if(isEven(num)){"é par"} else {"é impar"})
}

fun isEven(x:Int):Boolean{
  if (x % 2 == 0){ 
    return true 
  } else { 
    return false
  }
}