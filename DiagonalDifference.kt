import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 *   Hackerrank - Diagonal Difference
 *   https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    var counter = 0
    
    for(line in 1..arr.size){
        primaryDiagonal += arr[counter][counter]
        secondaryDiagonal += arr[counter][(arr.size - 1) - counter]
        counter++2
    }
    return Math.abs(primaryDiagonal - secondaryDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
