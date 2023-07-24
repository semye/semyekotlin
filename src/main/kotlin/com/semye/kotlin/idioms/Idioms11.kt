package com.semye.kotlin.idioms


/**
 * 在范围内迭代
 */
fun main() {
    // closed-ended range: includes 100
    for (i in 1..100) {
        println(i)
    }
    // open-ended range: does not include 100
    for (i in 1..<100) {
        println(i)
    }
    for (x in 2..10 step 2) {
        println(x)
    }
    //倒叙
    for (x in 10 downTo 1) {
        println(x)
    }
    (1..10).forEach {
        println(it)
    }
}

