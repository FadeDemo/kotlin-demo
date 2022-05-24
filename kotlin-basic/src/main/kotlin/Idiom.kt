package org.fade.demo.kotlindemo.kotlinbasic.idiom

import java.io.File
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths

// create pojo

data class Customer(val name: String, val email: String)

// default value for method parameter
fun foo(a: Int = 0, b: String = "") { /* do nothing */ }

// read only list
val list = listOf("a", "b", "c")

// read only map
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

// access map entry
val a = map["key"]

// traverse map
fun traverseMap() {
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

// iterate over a range
fun iterateOverRange() {
    // do not include 5
    for (i in 1 until 5) {
        println(i)
    }
    for (i in 5 downTo 1) {
        println(i)
    }
    (1..10).forEach { println(it) }
}

// lazy property

val p: String by lazy {
    return@lazy "Hello World"
}

// extension functions
// todo

// create singleton
object Resource {
    val name = "Name"
}

// instantiate an abstract class
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()

}

val myObject = object : MyAbstractClass() {

    override fun doSomething() {
        println("do something")
    }

    override fun sleep() {
        println("sleep")
    }

}

val values = mapOf("test" to 1, "email" to 2)
val email = values["email"] ?: throw IllegalStateException("Email is missing!")

val emails = listOf<String>()
val mainEmail = emails.firstOrNull() ?: ""

// build style usage of methods that return Unit
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}

}

class Rectangle {

    var length: Int = 0

    var breadth: Int = 0

    lateinit var color: String

}

// todo generic function that requires the generic type information

// mark code as to do
fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")

fun main() {
    iterateOverRange()
    println(p)
    println(Resource.name)
    myObject.doSomething()
    // if not null
    val files = File("Test").listFiles()
    println(files?.size)
    // if not null else
    println(files?.size ?: "empty")
    // To calculate the fallback value in a code block, use `run`
    val filesSize = files?.size ?: run {
        return@run 1024
    }
    println(filesSize)
    println(email)
    println(mainEmail)
    // execute if not null
    val value = 2
    value?.let {
        println(it)
    }
    // try-catch expression
    val result = try {
        1
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    println(result)
    arrayOfMinusOnes(5).forEach { println(it) }
    // call multiple method on an object instance
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
    // configure properties of an object
    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
        color = "0xFAFAFA"
    }
    // todo final can be modify?
    println(myRectangle.length)
    // try with resources
    val stream = try {
        Files.newInputStream(Paths.get("/some/file.txt"))
    } catch (e: java.lang.Exception) {
        null
    }
    stream?.let { it.buffered().reader().use { reader ->
        println(reader.readText())
    } }
    // nullable Boolean
    val b: Boolean? = null
    if (b == true) {

    } else {
        // `b` is false or null
    }
    // swap two variables
    var x = 1
    var y = 2
    x = y.also { y = x }
    println("x=$x")
    println("y=$y")
}