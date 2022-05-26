package org.fade.demo.kotlindemo.kotlinconcept.clz

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