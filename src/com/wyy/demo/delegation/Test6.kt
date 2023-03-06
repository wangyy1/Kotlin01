package com.wyy.demo.delegation

import java.lang.reflect.Member
import kotlin.properties.Delegates
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty

/**
 * 委托给另一个属性
 */


class MyClass {
    var newName: Int = 0

//    @Deprecated("")
//    val oldName: Int by ::newName
}


fun main() {

}