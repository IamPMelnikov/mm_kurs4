package ru.psu.studyit.servicereports.controller

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.psu.studyit.servicereports.dto.HelloResponseDto

@RestController
@RequestMapping("/hello") //kornevoy prefiks
class HelloRestController {

    @GetMapping("/basehello")
    fun baseHello(): ResponseEntity<HelloResponseDto> {
        return ResponseEntity(HelloResponseDto("basehello"), HttpStatus.OK) //end point
    }

    @GetMapping("/abobahello")
    fun abobaHello(): ResponseEntity<HelloResponseDto> {
        return ResponseEntity(HelloResponseDto("abobahello"), HttpStatus.OK) //end point
    }

    @GetMapping("/{name}")
    fun nameHello(@PathVariable("name") name: String): ResponseEntity<HelloResponseDto> {
        return ResponseEntity(HelloResponseDto(name), HttpStatus.OK) //end point + name
    }
}

