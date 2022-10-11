fun main(){
  print("Dia? ")
  val day = readln().toInt()
  print("Mês? ")
  val month = readln().toInt()
  print("Ano? ")
  val year = readln().toInt()

  val dateObj = Date(day, month, year)
  println(dateObj.validateDate())

}  

class Date(val day: Int, val month: Int, val year: Int){
  init{
    require(year in 1900..2050){ "Ano $year fora do intervalo 1900..2050" }
    require(month in 1..12){ "Mês $month fora do intervalo 1..12" }
    require(day in 1..31){ "Dia $day fora do intervalo 1..31" }
  }

  val maxDay = maxDays()

  fun isLeapYear(): Boolean{
    return if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) true else false
  }

  fun maxDays(): Int{
    var daysInMonth: Int
  
    when(month){
      1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31
      2 -> daysInMonth = 28
      else -> daysInMonth = 30
    }

    if(month == 2 && isLeapYear()) daysInMonth++ else

    require(day <= daysInMonth){"Dia $day fora do intervalo 1..$daysInMonth"}

    return daysInMonth
  }

  fun validateDate() = "Data $day/$month/$year é valida"
}
