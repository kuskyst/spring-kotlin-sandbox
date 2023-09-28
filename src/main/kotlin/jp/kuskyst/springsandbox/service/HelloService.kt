package jp.kuskyst.springsandbox.service

import org.springframework.stereotype.Service

@Service
interface HelloService {
    fun hello(name: String): String
}