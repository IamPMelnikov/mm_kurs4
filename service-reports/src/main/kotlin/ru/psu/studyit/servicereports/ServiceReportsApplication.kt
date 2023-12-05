package ru.psu.studyit.servicereports

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServiceReportsApplication //entry point

fun main(args: Array<String>) {
	runApplication<ServiceReportsApplication>(*args)
}
