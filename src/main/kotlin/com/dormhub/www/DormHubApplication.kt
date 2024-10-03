package com.dormhub.www

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DormHubApplication

fun main(args: Array<String>) {
    runApplication<DormHubApplication>(*args)
}
