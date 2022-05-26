package org.fade.demo.kotlindemo.kotlinconcept.controlflow

fun main() {
    println(max(2, 3))
    println(maxWithPrint(4, 3))
}

fun max(x: Int, y: Int) = if (x > y) x else y

fun maxWithPrint(x: Int, y: Int) =
    if (x > y) {
        println("choose $x")
        x
    } else {
        println("choose $y")
        y
    }