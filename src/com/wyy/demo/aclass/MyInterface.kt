package com.wyy.demo.aclass

import javax.swing.text.Position

interface MyInterface {
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println(prop)
    }

}

class Child: MyInterface {
    override val prop: Int = 29
}


interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"
}

data class Employee(
    override val firstName: String,
    override val lastName: String
) : Person




// 解决覆盖冲突
interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super.bar()
    }
}

fun main() {
    val d = D()
    d.foo();
    d.bar()
}