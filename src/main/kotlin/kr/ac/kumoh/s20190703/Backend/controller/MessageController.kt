package kr.ac.kumoh.s20190703.Backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/message")
class MessageController {
    @GetMapping
    // TODO : React 주소 변경할 것
    @CrossOrigin(origins=["https://taewookfront.netlify.app"])

    fun getMessage() = mapOf("status" to "success")
}