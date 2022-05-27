package org.fade.demo.kotlindemo.kotlinconcept.clz

fun main() {
    println("Constructing the derived class(\"hello\", \"world\")")
    DerivedO("hello", "world")
    val fr = FilledRectangle()
    fr.draw()
}

open class Base(p: Int)

class Derived(p: Int) : Base(p)

class AnotherDerived : Base {

    constructor(p: Int) : super(p) {

    }

}

abstract class AbstractParent {

    abstract fun doSomething()

}

class Child : AbstractParent() {
    override fun doSomething() {
        TODO("Not yet implemented")
    }

}

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }

}

class Circle() : Shape() {
    override fun draw() { /*...*/ }

}

interface ShapeP {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4) : ShapeP // Always has 4 vertices

class PolygonP : ShapeP {
    override var vertexCount: Int = 0  // Can be set to any number later
}

open class BaseO(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }

}

open class RectangleN {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class DerivedO(
    name: String,
    val lastName: String,
) : BaseO(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }

}

class FilledRectangle: RectangleN() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }

}

open class RectangleR {
    open fun draw() { /* ... */ }
}

interface PolygonR {
    fun draw() { /* ... */ } // interface members are 'open' by default

}

class Square() : RectangleR(), PolygonR {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<RectangleR>.draw() // call to Rectangle.draw()
        super<PolygonR>.draw() // call to Polygon.draw()
    }

}