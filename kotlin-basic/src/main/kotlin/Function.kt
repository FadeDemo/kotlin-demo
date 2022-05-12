// standard function

fun sum(a: Int, b: Int): Int {
    return a + b
}

// function body is an expression

fun sum1(a: Int, b: Int) = a + b

// return unless value

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit can be omitted

fun printSum1(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}