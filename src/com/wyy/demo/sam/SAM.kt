package com.wyy.demo.sam

import com.sun.org.apache.xpath.internal.operations.Bool


fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
}


typealias IntPredicate2 = (i: Int) -> Boolean


val isEven2: IntPredicate2 = { it: Int ->
    it % 2 == 0
}

internal class A{

}