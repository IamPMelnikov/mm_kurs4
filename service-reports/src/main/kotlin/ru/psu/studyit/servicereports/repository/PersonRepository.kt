package ru.psu.studyit.servicereports.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.psu.studyit.servicereports.model.Person

@Repository
interface PersonRepository: JpaRepository<Person, Long> {
}