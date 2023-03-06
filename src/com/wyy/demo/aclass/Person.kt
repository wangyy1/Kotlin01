package com.wyy.demo.aclass


class InitOrderDemo(
    name: String,
    isEmployed: Boolean = false
)  : Any() {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)


    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("Hello")
}