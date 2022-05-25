package org.fade.demo.kotlindemo.kotlinconcept.type

fun main() {
    val str = "abcd 123"
    println(str[0])
    for (c in str) {
        println(c)
    }
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}