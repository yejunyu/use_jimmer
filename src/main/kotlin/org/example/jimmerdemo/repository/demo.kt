package org.example.jimmerdemo.repository

/**
 * @author yjy
 * @emial yyyejunyu@gmail.com
 * @date 2024/8/1
 * @description
 **/
class demo {
}

fun main() {
    val A = Person("A")
    val B = Person("B")
    A likes B
    println(A.liked)
}

data class Person(val name: String) {
    val liked = mutableListOf<Person>()
    infix fun likes(other: Person) = liked.add(other)
}