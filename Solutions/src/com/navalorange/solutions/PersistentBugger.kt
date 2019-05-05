package com.navalorange.solutions

fun persistence(num: Int) : Int {
    return if (num < 10) {
        0
    } else {
        1 + persistence(num.toString().toList().map { it.toString().toInt() }.reduce(Int::times))
    }
}

fun main() {
    val x = persistence(3)
    println("Hello World $x")
}