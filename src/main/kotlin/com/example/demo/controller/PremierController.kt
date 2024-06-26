package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PremierController {

    @GetMapping("/premier")
    fun premier():String{
        return "premier"
    }
}