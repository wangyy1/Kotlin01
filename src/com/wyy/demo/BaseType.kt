package com.wyy.demo

import com.wyy.demo.modifier.Outer
import java.util.ArrayList
import java.util.concurrent.TimeUnit
import kotlin.math.acos

/**
 * 基本类型
 */
fun main(args: Array<String>) {

    // Byte
    val byte : Byte = 127

    // Short
    val short : Short = 32767

    // Int
    val int :Int = 2147483647

    // Long
    val long: Long = 9223372036854775807

    val pi: Float = 3.1415926f
    val p2: Double = 3.1415926

    val boolean: Boolean = false

    var aChar : Char = 'a'

    val text = """
        | ${"$"}for (c in "foo) 
        |    print(c)
    """.trimMargin("|")
    println(text)

    val uByte : Any = 1

    val uShort = 1u

    val array = arrayOf("1")

    var array1: Array<out Any>  = array

    if (uByte is String) {
    }


}