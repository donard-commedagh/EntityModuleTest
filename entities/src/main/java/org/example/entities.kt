package org.example

import java.time.LocalDateTime

data class Employee(
    val id: Int = 0,
    val name: String,
    val version: Int = 0,
    val createdAt: LocalDateTime = LocalDateTime.MIN,
    val updatedAt: LocalDateTime = LocalDateTime.MIN,
)