package com.wyy.demo.spreadFunction

/**
 * 扩展函数
 */


fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//fun main() {
//    val list = mutableListOf(1,2,3)
//    list.swap(0,2)
//    list.add(4)
//    println(list)
//}

/**
 * 扩展属性
 */
val <T> List<T>.lastIndex: Int
    get() = size - 1

//fun main() {
//    val list = mutableListOf(1,2,3)
//    println(list.lastIndex)
//}

/**
 * 伴生对象的扩展
 */
class MyClass {
    companion object {

    }
}

fun MyClass.Companion.printCompanion() {
    println("companion")
}

//fun main() {
//    MyClass.printCompanion()
//}


//fun main() {
//    open class Shape
//    class Rectangle : Shape()
//
//    fun Shape.getName() = "Shape"
//    fun Rectangle.getName() = "Rectangle"
//
//    fun printClassName(s: Shape) {
//        println(s.getName())
//    }
//
//    printClassName(Rectangle())
//
//
//}


class Host(val hostname: String) {
    fun printHostname() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() {
        print(port)
    }
    fun Host.printConnectionString() {
        printHostname()
        print(":")
        printPort();
    }
    fun connect() {
        host.printConnectionString()
    }
}

fun main() {
    Connection(Host("kotl.in"), 443).connect()
//    Host("kotl.in").printConnectionString
}
