package com.semye.kotlin.idioms

/**
 * Create DTOs (POJOs/POCOs)
 */
data class Customer(var name: String, var email: String)


fun main() {
    val customer = Customer("111", "222@gmail.com")
    println(customer)
}