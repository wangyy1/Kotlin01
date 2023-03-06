package com.wyy.demo.delegation

interface Base2 {
    val message: String
    fun print()
}

class BaseImpl2(val x: Int): Base2 {
    override val message: String = "BaseImpl: x = $x"

    override fun print() {
        println(message)
    }
}

class Derived2(b: Base2): Base2 by b {
    override val message: String = "Message of Derived"
}


fun main() {
    val b = BaseImpl2(10)
    val derived2 = Derived2(b)
    derived2.print()
    println(derived2.message)
}