package com.wyy.demo.delegation

import java.lang.reflect.Member
import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty

/**
 * 局部委托属性
 */

fun example(computeFoo: () -> Any) {
    val memoizedInt by lazy(computeFoo)

}




