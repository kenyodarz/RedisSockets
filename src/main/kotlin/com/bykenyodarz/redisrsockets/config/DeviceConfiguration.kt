package com.bykenyodarz.redisrsockets.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.IOException


@Configuration
class DeviceConfiguration {

    @Bean
    @Throws(IOException::class)
    fun getConnection(): DeviceConnection {
        return DeviceConnection("127.0.0.1", 9000)
    }
}