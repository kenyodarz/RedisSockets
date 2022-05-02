package com.bykenyodarz.redisrsockets.controller

import com.bykenyodarz.redisrsockets.service.SomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SomeController(service: SomeService) {

    private val service: SomeService

    init {
        service.also { this.service = it }
    }

    @GetMapping
    fun connectSocket(@RequestParam(value = "cmd", required = true) cmd: String): String {
        return service.doSomeService(cmd)
    }

}