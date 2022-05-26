package org.fade.demo.kotlindemo.kotlinconcept.controlflow

import java.util.*

fun main() {
    listOf("a", "b", "c").map { return@map it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }
    listOf("a", "b", "c").map local@ { return@local it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }
    listOf("a", "b", "c").map { fun(it: String):String { return it.uppercase(Locale.getDefault()) } }
        .forEach { println(it) }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) break@loop
            println("i=$i, j=$j")
        }
    }
}