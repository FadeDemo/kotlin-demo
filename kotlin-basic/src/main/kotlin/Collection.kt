package org.fade.demo.kotlindemo.kotlinbasic

import java.util.*

fun main() {
    // iterate over a collection
    val items = listOf("apple", "banana", "kiwifruit", "avocado")
    for (item in items) {
        println(item)
    }
    // check if a collection contains an object
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    // 类似stream
    items.filter { it.startsWith("a") }
        .sorted().map { it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }
}