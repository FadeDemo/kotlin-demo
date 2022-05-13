package org.fade.demo.kotlindemo.kotlinbasic

val a: Int = 1
// type can be inferred
val b = 1
// variables in top level must be initialized, and can not be
// reassigned in top level
var e = 3

fun main() {
    val c: Int
    c = 3
    var d = 2
    d = 3
}