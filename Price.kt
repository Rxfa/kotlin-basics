fun main(){
  print("Preço? ")
  val price = readln().split(".")
  println("""Preço ${price.joinToString(separator=".")} = ${price[0]} euros e ${price[1]} centimos = ${price.joinToString(separator=".")} centimos.""")
  print("Desconto?")
  val discount = readln().toDouble()
  val finalPrice = price.joinToString(separator=".").toFloat() * (100-discount) / 100
  println("""Preço final = ${price.joinToString(separator=".")} - ${discount}% = ${String.format("%.2f", finalPrice)} """)
}