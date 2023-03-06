package com.wyy.demo.enum

enum class RGB {
    RED, GREEN, BLUE
}

inline fun <reified T: Enum<T>> printAllValues() {
    enumValues<T>().joinToString { it.name }
}
