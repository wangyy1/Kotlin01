package com.wyy.demo.control


fun main() {
//    val array = arrayOf("a", "b", "c")
//
//    for (i in array.indices) {
//        println(array[i])
//    }
//
//    for ((index, value) in array.withIndex()) {
//        println("$index is $value")
//    }
//
//
//    loop@ for (i in 1..10) {
//        println("i is $i")
//        for (j in 1..10) {
//            println("j is $j")
//            if (j == 5) {
//                break
//            }
//        }
//    }

//    foo3()

    val s = null
    println(s is Nothing)
}
fun foo() {
    listOf(1,2,3,4,5).forEach {
        if (it == 3) return@forEach
        println(it)
    }

    println("this point is unreachable")
}

fun foo2() {
    listOf(1,2,3,4,5).forEach(fun(value: Int) {
        if (value == 3) return
        println(value)
    })
    print(" done with anonymous function")
}

fun foo3() {
    run {
        listOf(1,2,3,4,5).forEach {
            if (it == 3) return@run
            println(it)
        }
    }
    throw Exception("Hi There!")
    print(" done with nested loop")
}