package com.xetra11.testrestapi.api

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi {
    @GetMapping("/test")
    fun get(): HttpStatus {
        return HttpStatus.ACCEPTED
    }
}
