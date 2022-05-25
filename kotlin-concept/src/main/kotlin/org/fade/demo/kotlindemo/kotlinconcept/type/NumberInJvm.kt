package org.fade.demo.kotlindemo.kotlinconcept.type

fun main() {
    val a = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
}