package com.alphaStore.Admin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class AdminApplication

fun main(args: Array<String>) {
	runApplication<AdminApplication>(*args)
}
