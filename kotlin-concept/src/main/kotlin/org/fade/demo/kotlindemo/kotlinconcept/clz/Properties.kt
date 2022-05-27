package org.fade.demo.kotlindemo.kotlinconcept.clz

import java.util.Date

lateinit var c: Date

fun main() {
    var a = A(1)
    lateinit var d: Date
    
}

class A constructor(
    private var a: Int
) {

    // backing field

    var b: Int = 0
        set(value) {
            field = this.a
        }

    // backing properties

    private var _table: Map<String, Int>? = null

    val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }

}