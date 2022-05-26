package org.fade.demo.kotlindemo.kotlinconcept.clz

fun main() {
    var p = Person("张三")
    var i = InitOrderDemo("abc")
    var person = PersonWithProperties("三", "张", 22)
    println("person[firstName:${person.firstName},lastName:${person.lastName},age:${person.age}]")
    var d = DontCreateMe("d")
}

class Person constructor(firstName: String) { /*...*/ }

class PersonWithoutConstructor(firstName: String) { /*...*/ }

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

}

class PersonWithProperties(val firstName: String, val lastName: String, var age: Int)

// TODO difference between data and no data
data class PersonWithData(val firstName: String, val lastName: String, var age: Int)

class PersonWithSecondaryConstructor(val name: String) {
    private val children: MutableList<PersonWithSecondaryConstructor> = mutableListOf()

    constructor(name: String, parent: PersonWithSecondaryConstructor) : this(name) {
        parent.children.add(this)
    }

    constructor(name: String, parent: PersonWithSecondaryConstructor, age: Int) : this(name, parent) {

    }

}

class DontCreateMe private constructor () {

    constructor(name: String) : this() {

    }

}

open class Polygon {

    open fun draw() {
        // some default polygon drawing method
    }

}

abstract class WildShape : Polygon() {

    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()

}