package com.semye.kotlin.idioms

import java.io.File
import java.util.Random


/**
 * Execute a statement if null  执行语句
 */
fun main() {
    val values = mapOf<String, String>()
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")
}

