package com.wyy.demo.`fun`

val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))


fun main() {
    println(findFixPoint(123.0))


    val items = listOf(1,2,3,4,5)
    items.fold(0,  {acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result =- $result")
        result
    })

    val joinedToString = items.fold("Elements:") { acc, i ->
        "$acc $i"
    }

    val onClick: (Int) -> Unit = {

    }
}

class IntTransformer: (Int) -> Int {
    override fun invoke(p1: Int): Int {
        TODO("Not yet implemented")
    }

}

inline fun a(block: () -> Unit): Unit {
    println("hi!")
}

fun foo() {
    a {
        return
    }
}