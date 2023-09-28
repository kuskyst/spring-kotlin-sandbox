package jp.kuskyst.springsandbox.service.impl

import jp.kuskyst.springsandbox.service.HelloService
import org.springframework.stereotype.Service

@Service
class HelloServiceImpl : HelloService {

    override fun hello(name: String): String {
        return String.format("Hello %s!", name)
    }
}