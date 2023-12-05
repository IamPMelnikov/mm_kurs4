package ru.psu.studyit.servicereports.service

import org.springframework.stereotype.Service
import ru.psu.studyit.servicereports.dto.PersonCreateRequestDto
import ru.psu.studyit.servicereports.dto.PersonResponseDto
import ru.psu.studyit.servicereports.model.Person
import ru.psu.studyit.servicereports.repository.PersonRepository

@Service
class PersonServiceImpl(
        val personRepository: PersonRepository
): PersonService {
    override fun findAll(): List<PersonResponseDto> {
        return personRepository
                .findAll()
                .map { it -> PersonResponseDto(it.id, it.firstName, it.lastName) }
    }

    override fun save(personCreateRequestDto: PersonCreateRequestDto): Long? {
        val person = Person(personCreateRequestDto.id
                ?: 0L, personCreateRequestDto.firstName, personCreateRequestDto.lastName)
        return personRepository.save(person).id
    }
}