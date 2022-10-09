fun main(){

  /*
   * Work in progress ig
   * 
   * ¯\_(ツ)_/¯ 
   */

}

fun diff(x: Int, y:Int): Int = Math.abs(x - y) 

fun bigDiff(x: Int, y:Int, diff:Int){
  val list = listOf(x, y, diff).map({ Math.abs(it) })
  return Math.abs(list.max() - list.min())
}

