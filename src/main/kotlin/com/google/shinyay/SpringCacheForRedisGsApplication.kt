package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCacheForRedisGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCacheForRedisGsApplication>(*args)
}
