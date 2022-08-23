package org.fade.demo.kotlindemo.kotlinconcept.clz

data class User(val name: String, val age: Int)

fun main() {
    val jack = User("jack", 12)
    val oldJack = jack.copy()
    println(jack == oldJack)
    val (name, age) = jack
    println("$name:$age")
}