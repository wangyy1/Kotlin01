package com.wyy.demo.aclass

interface Shape {
    val vertexCount : Int
}

class Rectangle(override var vertexCount: Int) : Shape

class Polygon : Shape {
    override val vertexCount: Int
        get() = 0

    var counter = 0
        set(value) {
            field = value
        }

    lateinit var a : String

    fun onCreate(): Unit {
        if (::a.isInitialized) {

        }
    }
}

fun main() {

    val polygon = Polygon()

}