package main.kotlin.skeleton

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {
    @RequestMapping("/status")
    fun status() = "ok"
}