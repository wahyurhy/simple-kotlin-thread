package com.wahyurahayu.thread.kotlin

import kotlin.concurrent.thread

fun main() {
    thread(start = true, name = "Thread si Wahyu Rahayu") {
        (0..10).forEach {
            println(
                "Teks ke-$it dari ${Thread.currentThread().name}")
        }
    }

    (0..10).forEach {
        println(
            "Teks ke-$it dari Thread ${Thread.currentThread().name}")
    }
}
