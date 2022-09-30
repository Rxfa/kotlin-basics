fun main(){
    println("introduza um numero inteiro")
    val input = readln().toInt()
    if(input%2==0){
        println("O numero $input e par")
    } else {
        println("O numero $input e impar")
    }
}