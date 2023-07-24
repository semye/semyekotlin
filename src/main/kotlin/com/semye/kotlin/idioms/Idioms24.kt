package com.semye.kotlin.idioms




/**
 * Configure properties of an object (apply)
 */
fun main() {
    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
        color = 0xFAFAFA
    }
}

