package com.wyy.demo

fun main() {
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        override fun toString(): String {
            return "$hello $world"
        }
    }

    println(helloWorld)
}