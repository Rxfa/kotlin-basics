fun main(){
  print("Dia? ")
  val day = readln().toInt()
  print("Mês? ")
  val month = readln().toInt()
  print("Ano? ")
  val year = readln().toInt()

  when{
    year !in 1900..2050 -> "Ano $year fora do intervalo 1900..2050"
    month !in 1..12 -> "Mês $month fora do intervalo 1..12"
    else -> validateDate(day, month, year)
  }.also(::println)
}  

fun validateDate(day: Int, month: Int, year: Int): String{
  var daysInMonth: Int
  when(month){
    1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31
    2 -> daysInMonth = if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 29 else 28
    else -> daysInMonth = 30
  }

  return when{
    day !in 1..daysInMonth -> "Dia $day fora do intervalo 1..$daysInMonth"
    else -> "Data $day/$month/$year é valida"
  }
}
