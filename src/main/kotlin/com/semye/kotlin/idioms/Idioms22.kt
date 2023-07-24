package com.semye.kotlin.idioms


fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

/**
 * Return on when statement
 */
fun main() {
    transform("123")
}

