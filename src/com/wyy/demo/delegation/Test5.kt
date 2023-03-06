package com.wyy.demo.delegation

import kotlin.properties.Delegates

/**
 * 可观察属性
 */

class User {
    var name: String by Delegates.observable("<no name>") {prop, old, new ->
        println("$prop $old -> $new")
    }

    var age: Int by Delegates.vetoable(0) {prop, old, new ->
        if (old == new) {
            println("old == new")
            false
        } else {
            println("old != new")
            true
        }
    }
}
fun main() {
    val user = User()
    println(user.name)
    user.name = "first"
    user.name = "second"

    user.age = 1
    user.age = 1
}