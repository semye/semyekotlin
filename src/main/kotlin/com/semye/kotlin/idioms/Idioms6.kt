package com.semye.kotlin.idioms


class Foo {

}

class Bar {

}

fun check(x: Any) {
    when (x) {
        is Foo -> {
            println("is foo")
        }

        is Bar -> {
            println("is bar")
        }

        else -> {
            println("x is " + x.javaClass.name)
        }
    }
}

/**
 * 对象检查
 */
fun main() {
    check("999")
    check(9)
}

