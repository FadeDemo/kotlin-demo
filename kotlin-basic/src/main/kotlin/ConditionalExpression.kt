package org.fade.demo.kotlindemo.kotlinbasic

fun maxOf(a: Int, b: Int) = if (a > b) a else b

// same as below

/*
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
*/

fun main() {
    println(maxOf(1, 2))
}