package org.example.jimmerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JimmerDemoApplication

fun main(args: Array<String>) {
    runApplication<JimmerDemoApplication>(*args)
}
