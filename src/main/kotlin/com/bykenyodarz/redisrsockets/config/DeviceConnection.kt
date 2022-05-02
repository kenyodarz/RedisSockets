package com.bykenyodarz.redisrsockets.config

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.Socket


class DeviceConnection(ipAddress: String, port: Int) {

    private var socket: Socket

    init {
        this.socket = Socket(ipAddress, port)
    }

    @Synchronized
    fun call(request: String): String {

        val writer = PrintWriter(socket.getOutputStream(), true)
        val reader = BufferedReader(InputStreamReader(socket.getInputStream()))

        writer.println(request)

        return reader.readLine()
    }
}