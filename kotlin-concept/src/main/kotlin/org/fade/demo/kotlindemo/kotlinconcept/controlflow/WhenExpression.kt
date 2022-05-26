package org.fade.demo.kotlindemo.kotlinconcept.controlflow

fun main() {
    maxUseWhen(2, 3)
    print(2)
    print(null)
}

fun maxUseWhen(x: Int, y: Int) =
    when {
        x > y -> {
            println("choose $x")
            x
        }
        else -> {
            println("choose $y")
            y
        }
    }

fun print(x: Any?) =
    when (x) {
        is Int, is Long -> {
            println("$x is number")
        }
        else -> {
            println("$x is not number")
        }
    }