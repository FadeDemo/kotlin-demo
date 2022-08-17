package org.fade.demo.kotlindemo.kotlinconcept.clz

import java.util.Date

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun Date.test() {
    println("test")
}

class Example {
    /**
     * 函数签名相同时，优先级更高
     * */
    fun printFunctionType() { println("Class method") }
}

fun Example.printFunctionType() { println("Extension function") }

fun main() {
    val date = Date()
    date.test()
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
    Example().printFunctionType()
}