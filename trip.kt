val HOURSTOSECONDS = 3600
val MINUTESTOSECONDS = 60

fun main(){
  print("Trip start: ")
  val iniTime = readln()
  val totalInitTime = extractTime(iniTime)
  print("Trip end: ")
  val endTime = readln()
  val totalEndTime = extractTime(endTime)
  calcDiff(totalInitTime, totalEndTime)
}

fun extractTime(time:String): Int{
  val totalTime = time.split(":").map({ it.toInt() })
  return totalTime[0] * HOURSTOSECONDS + totalTime[1] * MINUTESTOSECONDS + totalTime[2]
}

fun calcDiff(start: Int, end: Int){
  val timeDiff = end - start
  val hourDiff = timeDiff / HOURSTOSECONDS
  val minDiff = (timeDiff / MINUTESTOSECONDS) % MINUTESTOSECONDS
  val secDiff = timeDiff % MINUTESTOSECONDS
  println("Trip duration: $hourDiff:$minDiff:$secDiff")
}
