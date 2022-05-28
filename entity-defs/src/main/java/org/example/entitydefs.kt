package org.example

import org.komapper.annotation.*

@KomapperEntityDef(Employee::class)
@KomapperTable("Employees")
data class EmployeeDef(
    @KomapperId @KomapperAutoIncrement
    val id: Nothing,
    val name: Nothing,
    @KomapperVersion
    val version: Nothing,
    @KomapperCreatedAt
    val createdAt: Nothing,
    @KomapperUpdatedAt
    val updatedAt: Nothing,
)
