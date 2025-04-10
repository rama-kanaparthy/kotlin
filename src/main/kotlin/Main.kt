package org.example

fun moveZerosToEnd(arr: IntArray): IntArray {
    val result = mutableListOf<Int>()
    var zeroCount = 0

    for (num in arr) {
        if (num == 0) zeroCount++ else result.add(num)
    }

    repeat(zeroCount) { result.add(0) }
    return result.toIntArray()
}

// Usage
fun main() {
    val arr = intArrayOf(0, 1, 0, 3, 12)
    println(moveZerosToEnd(arr).joinToString()) // Output: 1, 3, 12, 0, 0
}


