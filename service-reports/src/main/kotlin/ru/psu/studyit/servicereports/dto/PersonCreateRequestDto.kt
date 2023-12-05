package ru.psu.studyit.servicereports.dto

import jakarta.persistence.Column

data class PersonCreateRequestDto (
        var id: Long?,

        var firstName: String,

        var lastName: String
)