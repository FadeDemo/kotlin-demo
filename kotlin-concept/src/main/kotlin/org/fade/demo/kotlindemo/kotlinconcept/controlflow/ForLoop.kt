package org.fade.demo.kotlindemo.kotlinconcept.controlflow

fun main() {
    for (i in 1..3) {
        println(i)
    }
    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println(array[i])
    }
}