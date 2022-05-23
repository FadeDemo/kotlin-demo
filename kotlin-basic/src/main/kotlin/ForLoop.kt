package org.fade.demo.kotlindemo.kotlinbasic

fun main() {
    var items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}