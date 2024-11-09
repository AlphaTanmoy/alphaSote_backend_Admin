package com.AlphaStore.Admin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class AdminApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdminApplication::class.java, *args)
}
