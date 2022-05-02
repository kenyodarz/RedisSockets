package com.bykenyodarz.redisrsockets.service

import com.bykenyodarz.redisrsockets.config.DeviceConnection
import org.springframework.stereotype.Service

@Service
class SomeService(connection: DeviceConnection) {

    private val connection: DeviceConnection

    init {
        connection.also { this.connection = it }
    }

    fun doSomeService(input: String): String {
        return connection.call(input)
    }

}