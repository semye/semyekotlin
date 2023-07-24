package com.semye.kotlin.idioms


/**
 * 检查元素是否在集合中
 */
fun main() {
    val emailsList = listOf("john@example.com", "jane2@example.com")
    if ("john@example.com" in emailsList) {
        println("john@example.com 存在于集合列表中")
    }

    if ("jane@example.com" !in emailsList) {
        println("jane@example.com 不存在于集合列表中")
    }
}