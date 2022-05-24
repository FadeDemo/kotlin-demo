package org.fade.demo.kotlindemo.kotlinbasic.idiom

// create pojo

data class Customer(val name: String, val email: String)

// default value for method parameter
fun foo(a: Int = 0, b: String = "") { /* do nothing */ }

// read only list
val list = listOf("a", "b", "c")

// read only map
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

// access map entry
val a = map["key"]

// traverse map
fun traverseMap() {
    for ((k, v) in map) {
        println("$k -> $v")
    }
}