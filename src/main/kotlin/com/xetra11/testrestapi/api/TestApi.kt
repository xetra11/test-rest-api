package com.xetra11.testrestapi.api

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {
    @GetMapping("/test")
    fun get(): HttpStatus {
        LOG.info("Request Arrived!")
        return HttpStatus.ACCEPTED
    }

    companion object {
        private val LOG: Logger = LoggerFactory.getLogger(TestApi::class.java.name)
    }
}
