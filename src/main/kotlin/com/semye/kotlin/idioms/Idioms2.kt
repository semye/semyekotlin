package com.semye.kotlin.idioms

/**
 * 函数参数设置默认值
 */
fun foo(a: Int = 0, b: String = "222") {
    println("a:" + a + ",b:" + b)
}

fun main() {
    foo()
}