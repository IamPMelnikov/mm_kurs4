package ru.psu.studyit.servicereports.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.psu.studyit.servicereports.dto.HelloResponseDto
import ru.psu.studyit.servicereports.dto.PersonCreateRequestDto
import ru.psu.studyit.servicereports.dto.PersonResponseDto
import ru.psu.studyit.servicereports.service.PersonService

@RestController
@RequestMapping("/person")
class PersonRestController(
  val personService: PersonService
) {

    @GetMapping
    fun findAll(): ResponseEntity<List<PersonResponseDto>> {
        val findAll = personService.findAll()
        return ResponseEntity(findAll, HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody personCreateRequestDto: PersonCreateRequestDto): ResponseEntity<Long?> {
        val id = personService.save(personCreateRequestDto)
        return ResponseEntity(id, HttpStatus.CREATED)
    }
}