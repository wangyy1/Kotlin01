package com.wyy.demo.sealed

sealed class Expr

class Const(val value: Int): Expr()

class Sum(val left: Expr, val right: Expr) : Expr()


fun eval(e: Expr): Int {
   return when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
    }
}