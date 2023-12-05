package ru.psu.studyit.servicereports.service

import ru.psu.studyit.servicereports.dto.PersonCreateRequestDto
import ru.psu.studyit.servicereports.dto.PersonResponseDto

interface PersonService {

    fun findAll(): List<PersonResponseDto>

    fun save(personCreateRequestDto: PersonCreateRequestDto): Long?
}