package basicsyntax

import java.nio.file.Files
import java.nio.file.Path

var number: Int = 1
var text: String = "hello"
var factor: Double = 0.1

val immutableNumber: Int = 2
val immutableFactor: Double = 0.2


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println(sum(a, b))
}

fun chooseMax(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun toInt(s: String): Int {
    val asInt: Int? = s.toIntOrNull()
    return if (asInt == null) {
        -1
    } else {
        asInt
    }
}

fun checkedExceptions(path: Path) {
    Files.isHidden(path)
}

fun safeCall() {
    val a: String = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call
}