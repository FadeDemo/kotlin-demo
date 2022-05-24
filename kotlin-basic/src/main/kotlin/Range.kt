package org.fade.demo.kotlindemo.kotlinbasic

fun main() {
    // check if a number is within a range
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
    // check if a number out of range
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
    // iterate over a range
    for (x in 1..5) {
        print(x)
    }
    println()
    // over a progression
    // 即每次迭代多少步
    for (x in 1..10 step 2) {
        print(x)
    }
}