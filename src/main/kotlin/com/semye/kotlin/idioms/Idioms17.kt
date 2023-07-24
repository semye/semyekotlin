package com.semye.kotlin.idioms

import java.io.File
import java.util.Random


fun getSomeSize(): Int {
    return kotlin.random.Random(111).nextInt()
}

/**
 * 空指针设置默认值
 */
fun main() {
    val files = File("Test").listFiles()

    // For simple fallback values:
    println(files?.size ?: "empty") // if files is null, this prints "empty"

    // To calculate a more complicated fallback value in a code block, use `run`
    val filesSize = files?.size ?: run {
        val someSize = getSomeSize()
        someSize * 2
    }
    println(filesSize)
}

