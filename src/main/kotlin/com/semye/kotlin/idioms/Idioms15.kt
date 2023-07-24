package com.semye.kotlin.idioms


abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

/**
 * 初始化抽象类
 */
fun main() {
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
           println("doSomething")
        }

        override fun sleep() {
            println("sleep")
        }
    }
    myObject.doSomething()
}

