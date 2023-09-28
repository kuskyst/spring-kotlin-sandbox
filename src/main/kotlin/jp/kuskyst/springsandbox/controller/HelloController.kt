package jp.kuskyst.springsandbox.controller

import jp.kuskyst.springsandbox.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController constructor(private val helloService: HelloService) {

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return helloService.hello(name)
    }

}