package com.wyy.demo

interface Factory<T> {
    fun create(): T
}


class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}

fun main() {


    val instance1 = MyClass.create()
    val instance2 = MyClass.create()

    val f: Factory<MyClass> = MyClass

    println(instance1)
    println(instance2)

}