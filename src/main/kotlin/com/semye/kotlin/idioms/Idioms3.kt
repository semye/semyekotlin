package com.semye.kotlin.idioms


/**
 * list filter 对列表进行过滤
 */
fun main() {
    val list = listOf(-1, -10, 9, 10, 2)
    val positives = list.filter { x -> x > 0 }
    println(positives)
}