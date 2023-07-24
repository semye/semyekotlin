package com.semye.kotlin.idioms


/**
 * Execute if not null
 * 不为空才执行
 */
fun main() {
    val value = "9999"

    value?.let {
        println(it)
    }
}

