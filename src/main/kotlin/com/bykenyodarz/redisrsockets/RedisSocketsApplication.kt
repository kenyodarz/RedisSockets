package com.bykenyodarz.redisrsockets

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisSocketsApplication

fun main(args: Array<String>) {
    runApplication<RedisSocketsApplication>(*args)
}
