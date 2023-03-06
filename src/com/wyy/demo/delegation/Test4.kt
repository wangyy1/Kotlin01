package com.wyy.demo.delegation

/**
 * 延迟属性
 */

val lazyValue: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("computed!")
    "Hello"
}
fun main() {

    println(lazyValue)
    println(lazyValue)


}