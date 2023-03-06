package com.wyy.demo.delegation

import java.lang.reflect.Member
import kotlin.properties.Delegates
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty

/**
 * 将属性存储在Map中
 */


class User2(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int by map
}


fun main() {
    val mapOf = mutableMapOf<String, Any?>(
            "name" to "John Doe",
            "age" to 25
    )
    val user = User2(mapOf)
    println("${user.name} ${user.age}")

    mapOf["age"] = 26

    println("${user.name} ${user.age}")

    user.age = 27
    println("${user.name} ${user.age}")
    println(mapOf)

}