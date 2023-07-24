package com.semye.kotlin.idioms


fun String.spaceToCamelCase(): String {
    val list = this.split(" ")
    return list.toString()
}

/**
 * 扩展函数
 */
fun main() {
    println("Convert this to camelcase".spaceToCamelCase())
}

