package org.fade.demo.kotlindemo.kotlinconcept.controlflow

import java.io.IOException

fun main() {
    println(getInt("40"))
    println(getInt("ddd"))
    throw IOException()
}

fun getInt(a: String) = try { a.toInt() } catch (e: NumberFormatException) { null } finally {
    20
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}