package ru.psu.studyit.servicereports.model

import jakarta.persistence.*

@Entity
@Table(name = "person") //name of table in db
class Person ( //table in db

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long?,

        @Column(name = "first_name")
        var firstName: String,

        @Column(name = "last_name")
        var lastName: String
)