package com.semye.kotlin.idioms


/**
 * Get first item of a possibly empty collection
 * 获取第一个元素，如果元素不存在则返回空
 */
fun main() {
    val emails = listOf<Int>()
    val mainEmail = emails.firstOrNull() ?: "123"
    println(mainEmail)
}

