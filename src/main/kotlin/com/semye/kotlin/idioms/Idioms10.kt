package com.semye.kotlin.idioms


/**
 * 转换map为键值对
 */
fun main() {
    val map = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3)
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

