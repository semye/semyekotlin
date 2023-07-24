package com.semye.kotlin.idioms


/**
 * 读写map
 */
fun main() {
    val map = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(map["key1"])
    map["key1"] = 999
}

