package com.semye.kotlin.idioms

import java.io.File


/**
 * 空指针检查
 */
fun main() {
    val files = File("Test").listFiles()

    println(files?.size) // size is printed if files is not null
}

